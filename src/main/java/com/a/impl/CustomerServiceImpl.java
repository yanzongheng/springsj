package com.a.impl;

import com.a.dao.CustomerDao;
import com.a.entity.Customer;
import com.a.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> selectCustomer() {
        return customerDao.selectCustomer();
    }

    @Override
    public void insertCustomer(Customer customer) {

        customerDao.insertCustomer(customer);
    }

    @Override
    public void deleteCustomer(Integer integer) {

        customerDao.deleteCustomer(integer);
    }


}
