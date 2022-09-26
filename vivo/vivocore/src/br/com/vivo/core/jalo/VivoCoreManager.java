/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivo.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import br.com.vivo.core.constants.VivoCoreConstants;
import br.com.vivo.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class VivoCoreManager extends GeneratedVivoCoreManager
{
	public static final VivoCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (VivoCoreManager) em.getExtension(VivoCoreConstants.EXTENSIONNAME);
	}
}
