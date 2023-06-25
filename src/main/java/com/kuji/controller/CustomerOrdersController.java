package com.kuji.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kuji.dao.mapper.customerorders.CustomerOrdersMapper;
import com.kuji.domain.CustomerOrdersDomain;
import com.kuji.entity.CustomerOrder;
import com.kuji.entity.request.AddCustomerOrderRequest;
import com.kuji.entity.request.UpdateCustomerOrderRequest;

@RestController
public class CustomerOrdersController {

    @Autowired
    CustomerOrdersMapper mapper;

    @Autowired
    private CustomerOrdersDomain domain;

    @GetMapping("/customer-orders")
    public List<CustomerOrder> getCustomerOrders() throws Exception {
        List<CustomerOrder> response = domain.getCustomerOrders();
        return response;
    }

    @PostMapping("/add-customer-order")
    public void addCustomerOrder(@RequestBody AddCustomerOrderRequest request) throws Exception {
         domain.addCustomerOrder(
                request.getDivision(),
                request.getGroup(),
                request.getName(),
                request.getDrink());
    }

    @PutMapping("/update-customer-order")
    public void updateCustomerOrder(@RequestBody UpdateCustomerOrderRequest request) throws Exception {
        domain.updateCustomerOrder(
                request.getId(),
                request.getDivision(),
                request.getGroup(),
                request.getName(),
                request.getDrink());
    }

    @DeleteMapping("/delete-customer-order")
    public void deleteCustomerOrder(@RequestParam Integer id) throws Exception {
        domain.deleteCustomerOrder(id);
    }

}
