package br.com.vivo.core.service.impl;

import br.com.vivo.core.dao.VivoCustomerDao;
import br.com.vivo.core.service.VivoPaymentService;
import de.hybris.platform.core.model.user.CustomerModel;
import org.springframework.stereotype.Service;

@Service
public class DefaultVivoPaymentService implements VivoPaymentService {

    private VivoCustomerDao vivoCustomerDao;

    @Override
    public void savePaymentInfoClient(CustomerModel customerModel) {
        vivoCustomerDao.updateCustomerPaymentInfo(customerModel);
    }

    @Override
    public CustomerModel findCustomerById(String id) {
        return vivoCustomerDao.findCustomerById(id);
    }

    public VivoCustomerDao getVivoCustomerDao() {
        return vivoCustomerDao;
    }

    public void setVivoCustomerDao(VivoCustomerDao vivoCustomerDao) {
        this.vivoCustomerDao = vivoCustomerDao;
    }
}
