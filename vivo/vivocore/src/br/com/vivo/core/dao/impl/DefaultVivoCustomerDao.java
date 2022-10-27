package br.com.vivo.core.dao.impl;

import br.com.vivo.core.dao.VivoCustomerDao;
import br.com.vivo.core.exceptions.ObjectNotFoundException;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class DefaultVivoCustomerDao extends AbstractItemDao implements VivoCustomerDao {

    private static final Logger LOGGER = LogManager.getLogger(DefaultVivoCustomerDao.class);
    private final String CUSTOMER_QUERY="SELECT{" + CustomerModel.PK + "} FROM {" + CustomerModel._TYPECODE + "} WHERE {" +
            CustomerModel.CUSTOMERID +"} =?code";

    @Override
    public CustomerModel findCustomerById(String id) {
        ServicesUtil.validateParameterNotNull(id,"ID must be not null");
        final Map<String,String> params = new HashMap<>();
        params.put("code",id);
        SearchResult<CustomerModel> searchResult = getFlexibleSearchService().search(CUSTOMER_QUERY, params);
        if (searchResult.getResult().isEmpty()){
            throw new ObjectNotFoundException("Not found a client for id: " + id);
        }
        return searchResult.getResult().get(0);
    }

    @Override
    public void updateCustomerPaymentInfo(CustomerModel customerModel) {
        getModelService().save(customerModel);
    }
}
