package com.kuji.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddCustomerOrderRequest {

    private String division;
    private String group;
    private String name;
    private String drink;

}
