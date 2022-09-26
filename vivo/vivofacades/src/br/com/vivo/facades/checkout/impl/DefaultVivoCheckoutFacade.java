package br.com.vivo.facades.checkout.impl;

import br.com.vivo.facades.checkout.VivoCheckoutFacade;
import de.hybris.platform.commercefacades.order.impl.DefaultCheckoutFacade;
import org.apache.log4j.Logger;

public class DefaultVivoCheckoutFacade extends DefaultCheckoutFacade implements VivoCheckoutFacade  {

    private static final Logger LOGGER = Logger.getLogger(DefaultCheckoutFacade.class);


    @Override
    public void sendPayment() {

    }
}
