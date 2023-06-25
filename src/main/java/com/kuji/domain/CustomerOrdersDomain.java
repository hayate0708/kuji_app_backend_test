package com.kuji.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuji.dao.CustomerOrdersDao;
import com.kuji.entity.CustomerOrder;

@Service
public class CustomerOrdersDomain {

    @Autowired
    private CustomerOrdersDao dao;

    public List<CustomerOrder> getCustomerOrders() throws Exception {
        List<CustomerOrder> response = dao.getCustomerOrders();
        return response;
    }

    public void addCustomerOrder(String division, String group, String name, String drink) throws Exception {

        Integer id = dao.getCustomerOrderId();
        dao.addCustomerOrder(id, division, group, name, drink);
    }

    public void updateCustomerOrder(Integer id, String division, String group, String name, String drink)
            throws Exception {
        dao.updateCustomerOrder(id, division, group, name, drink);
    }

    public void deleteCustomerOrder(Integer id)
            throws Exception {
        dao.deleteCustomerOrder(id);
    }

}
