package com.a.service;

import com.a.entity.Customer;
import com.a.entity.Table;

import java.util.List;

public interface CustomerService {
    List<Customer>  selectCustomer();
    void insertCustomer(Customer customer);
    void deleteCustomer(Integer integer);

}
