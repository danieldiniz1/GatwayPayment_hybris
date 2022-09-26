/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivo.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;
import br.com.vivo.constants.VivowebservicesConstants;

public class VivowebservicesManager extends GeneratedVivowebservicesManager
{
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger( VivowebservicesManager.class.getName() );
	
	public static final VivowebservicesManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (VivowebservicesManager) em.getExtension(VivowebservicesConstants.EXTENSIONNAME);
	}
	
}
