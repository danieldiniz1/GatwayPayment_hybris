package br.com.vivo.core.service;

import de.hybris.platform.core.model.user.CustomerModel;

public interface VivoPaymentService {


    void savePaymentInfoClient(CustomerModel customerModel);

    CustomerModel findCustomerById(String id);
}
