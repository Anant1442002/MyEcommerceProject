package com.edubridge.mobilestore.dto;

import lombok.Data;

import java.util.Set;

import com.edubridge.mobilestore.entity.Address;
import com.edubridge.mobilestore.entity.Customer;
import com.edubridge.mobilestore.entity.Order;
import com.edubridge.mobilestore.entity.OrderItem;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}