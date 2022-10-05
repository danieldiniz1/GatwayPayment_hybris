/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivo.setup;

import static br.com.vivo.constants.PagueseguropaymentConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import br.com.vivo.constants.PagueseguropaymentConstants;
import br.com.vivo.service.PagueseguropaymentService;


@SystemSetup(extension = PagueseguropaymentConstants.EXTENSIONNAME)
public class PagueseguropaymentSystemSetup
{
	private final PagueseguropaymentService pagueseguropaymentService;

	public PagueseguropaymentSystemSetup(final PagueseguropaymentService pagueseguropaymentService)
	{
		this.pagueseguropaymentService = pagueseguropaymentService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		pagueseguropaymentService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return PagueseguropaymentSystemSetup.class.getResourceAsStream("/pagueseguropayment/sap-hybris-platform.png");
	}
}
