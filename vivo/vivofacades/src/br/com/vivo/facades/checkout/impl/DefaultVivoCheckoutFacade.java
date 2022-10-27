package br.com.vivo.facades.checkout.impl;

import br.com.vivo.core.service.VivoPaymentService;
import br.com.vivo.facades.checkout.VivoCheckoutFacade;
import br.com.vivo.facades.form.CompraCartaoForm;
import br.com.vivo.service.PagueseguropaymentService;
import de.hybris.platform.commercefacades.order.impl.DefaultCheckoutFacade;
import org.apache.log4j.Logger;

public class DefaultVivoCheckoutFacade extends DefaultCheckoutFacade implements VivoCheckoutFacade  {

    private static final Logger LOGGER = Logger.getLogger(DefaultCheckoutFacade.class);

    private VivoPaymentService vivoPaymentService;

    private PagueseguropaymentService pagueseguropaymentService;

    @Override
    public void sendPayment(CompraCartaoForm form) {
        //metodo privado para salvar as infos no banco de dados criptografado se varia´vel de aceite for true;
        vivoPaymentService.findCustomerById(form.getEmail());
        getVivoPaymentService();



        // iniciar chamada para cbrança pelo cartão de crédito
        String token = getPagueseguropaymentService().getToken();
        getPagueseguropaymentService();
    }

    public VivoPaymentService getVivoPaymentService() {
        return vivoPaymentService;
    }

    public void setVivoPaymentService(VivoPaymentService vivoPaymentService) {
        this.vivoPaymentService = vivoPaymentService;
    }

    public PagueseguropaymentService getPagueseguropaymentService() {
        return pagueseguropaymentService;
    }

    public void setPagueseguropaymentService(PagueseguropaymentService pagueseguropaymentService) {
        this.pagueseguropaymentService = pagueseguropaymentService;
    }
}
