package br.com.vivo.facades.checkout;

import br.com.vivo.facades.form.CompraCartaoForm;
import de.hybris.platform.commercefacades.order.CheckoutFacade;

public interface VivoCheckoutFacade extends CheckoutFacade {

    void sendPayment(CompraCartaoForm form);
}
