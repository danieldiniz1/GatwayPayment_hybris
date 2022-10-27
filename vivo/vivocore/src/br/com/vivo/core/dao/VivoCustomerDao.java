package br.com.vivo.core.dao;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;

public interface VivoCustomerDao extends Dao {

    CustomerModel findCustomerById(String id);

    void updateCustomerPaymentInfo(CustomerModel customerModel);
}
