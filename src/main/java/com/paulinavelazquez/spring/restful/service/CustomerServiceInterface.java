package com.paulinavelazquez.spring.restful.service;

import com.paulinavelazquez.spring.restful.domain.Customer;

import java.util.List;

// added Interface at end of name. Delete after done
public interface CustomerServiceInterface {
    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();
    Customer saveCustomer(Customer customer);
}