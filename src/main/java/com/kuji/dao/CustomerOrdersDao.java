package com.kuji.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kuji.dao.mapper.customerorders.CustomerOrdersMapper;
import com.kuji.entity.CustomerOrder;

@Repository
public class CustomerOrdersDao {

    @Autowired
    CustomerOrdersMapper mapper;

    public Integer getCustomerOrderId() throws Exception {
        return mapper.getCustomerOrderId();
    }

    public List<CustomerOrder> getCustomerOrders() throws Exception {
        List<CustomerOrder> customerOrders = mapper.getCustomerOrders();
        return customerOrders;
    }

    public void addCustomerOrder(Integer id, String division, String group, String name, String drink)
            throws Exception {
        mapper.addCustomerOrder(id, division, group, name, drink);
    }

    public void updateCustomerOrder(Integer id, String division, String group, String name, String drink)
            throws Exception {
        mapper.updateCustomerOrder(id, division, group, name, drink);
    }

    public void deleteCustomerOrder(Integer id) throws Exception {
        mapper.deleteCustomerOrder(id);
    }

}
