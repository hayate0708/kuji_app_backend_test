package com.kuji.dao.mapper.customerorders;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.kuji.entity.CustomerOrder;

@Mapper
public interface CustomerOrdersMapper {

    Integer getCustomerOrderId();

    List<CustomerOrder> getCustomerOrders();

    void addCustomerOrder(
            @Param("id") Integer id,
            @Param("division") String division,
            @Param("seat_group") String group,
            @Param("name") String name,
            @Param("drink") String drink);

    void updateCustomerOrder(
            @Param("id") Integer id,
            @Param("division") String division,
            @Param("seat_group") String group,
            @Param("name") String name,
            @Param("drink") String drink);

    void deleteCustomerOrder(@Param("id") Integer id);
}
