package br.com.vivo.facades.checkout;

import de.hybris.platform.commercefacades.order.CheckoutFacade;

public interface VivoCheckoutFacade extends CheckoutFacade {

    void sendPayment();
}
