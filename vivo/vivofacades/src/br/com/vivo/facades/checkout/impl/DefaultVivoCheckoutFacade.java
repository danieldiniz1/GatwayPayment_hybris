package br.com.vivo.facades.checkout.impl;

import br.com.vivo.core.service.VivoPaymentService;
import br.com.vivo.facades.checkout.VivoCheckoutFacade;
import br.com.vivo.facades.form.CompraCartaoForm;
import de.hybris.platform.commercefacades.order.impl.DefaultCheckoutFacade;
import org.apache.log4j.Logger;

public class DefaultVivoCheckoutFacade extends DefaultCheckoutFacade implements VivoCheckoutFacade  {

    private static final Logger LOGGER = Logger.getLogger(DefaultCheckoutFacade.class);

    private VivoPaymentService vivoPaymentService;

    @Override
    public void sendPayment(CompraCartaoForm form) {
        //metodo privado para salvar as infos na banco de dados criptografado
        getVivoPaymentService();
    }

    public VivoPaymentService getVivoPaymentService() {
        return vivoPaymentService;
    }

    public void setVivoPaymentService(VivoPaymentService vivoPaymentService) {
        this.vivoPaymentService = vivoPaymentService;
    }
}
