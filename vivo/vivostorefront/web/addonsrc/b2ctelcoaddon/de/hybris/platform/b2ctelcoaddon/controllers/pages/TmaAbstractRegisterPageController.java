/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.b2ctelcoaddon.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractRegisterPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.acceleratorstorefrontcommons.forms.ConsentForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.GuestForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.LoginForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.subscriptionfacades.SubscriptionFacade;
import de.hybris.platform.subscriptionfacades.exceptions.SubscriptionFacadeException;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 * Register page controller.
 */
public abstract class TmaAbstractRegisterPageController extends AbstractRegisterPageController
{
	private static final Logger LOG = LoggerFactory.getLogger(TmaAbstractRegisterPageController.class);

	@Resource(name = "subscriptionFacade")
	private SubscriptionFacade subscriptionFacade;

	protected SubscriptionFacade getSubscriptionFacade()
	{
		return subscriptionFacade;
	}

	@Override
	protected String processRegisterUserRequest(final String referer, final RegisterForm form, // NOSONAR
			final BindingResult bindingResult, final Model model, final HttpServletRequest request,
			final HttpServletResponse response, final RedirectAttributes redirectModel) throws CMSItemNotFoundException
	{
		getRegistrationValidator().validate(form, bindingResult);

		if (bindingResult.hasErrors())
		{
			form.setTermsCheck(false);
			model.addAttribute(form);
			model.addAttribute(new LoginForm());
			model.addAttribute(new GuestForm());
			GlobalMessages.addErrorMessage(model, "form.global.error");
			return handleRegistrationError(model);
		}

		final RegisterData data = new RegisterData();
		data.setFirstName(form.getFirstName());
		data.setLastName(form.getLastName());
		data.setLogin(form.getEmail());
		data.setPassword(form.getPwd());
		data.setTitleCode(form.getTitleCode());
		try
		{
			getCustomerFacade().register(data);
			getAutoLoginStrategy().login(form.getEmail().toLowerCase(), form.getPwd(), request, response);
			final ConsentForm consentForm = form.getConsentForm();
			if (consentForm != null && consentForm.getConsentGiven())
			{
				getConsentFacade().giveConsent(consentForm.getConsentTemplateId(), consentForm.getConsentTemplateVersion());
			}
			getSubscriptionFacade().updateProfile(new HashMap<String, String>());

			GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.CONF_MESSAGES_HOLDER,
					"registration.confirmation.message.title");
		}
		catch (final DuplicateUidException e)
		{
			LOG.warn("registration failed: " + e);
			model.addAttribute(form);
			model.addAttribute(new LoginForm());
			model.addAttribute(new GuestForm());
			bindingResult.rejectValue("email", "registration.error.account.exists.title");
			GlobalMessages.addErrorMessage(model, "form.global.error");
			return handleRegistrationError(model);
		}
		catch (final SubscriptionFacadeException e)
		{
			LOG.warn("Creating new subscription billing profile for user failed", e);
			model.addAttribute(new LoginForm());
			GlobalMessages.addErrorMessage(model, "registration.error.subscription.billing.profil");
			return handleRegistrationError(model);
		}

		return REDIRECT_PREFIX + getSuccessRedirect(request, response);
	}

}
