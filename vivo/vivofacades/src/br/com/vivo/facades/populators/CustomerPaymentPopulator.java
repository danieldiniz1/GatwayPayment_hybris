package br.com.vivo.facades.populators;

import br.com.vivo.core.model.VivoPaymentInfoModel;
import br.com.vivo.facades.form.CompraCartaoForm;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Arrays;

public class CustomerPaymentPopulator implements Populator<CompraCartaoForm, CustomerModel> {

    private ModelService modelService;

    @Override
    public void populate(CompraCartaoForm source, CustomerModel target) throws ConversionException {
        target.setPaymentsList(Arrays.asList(populateInfoPayments(source)));
    }

    private VivoPaymentInfoModel populateInfoPayments(CompraCartaoForm source) {
        VivoPaymentInfoModel vivoPaymentInfo = new VivoPaymentInfoModel();
        vivoPaymentInfo.setCreditCardNumber(source.getNumeroCartao());

        vivoPaymentInfo.setCreditCardDateValidate(source.getVencimentoCartao());
        vivoPaymentInfo.setCreditCardCVV(source.getCvvCartao());
        return vivoPaymentInfo;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
