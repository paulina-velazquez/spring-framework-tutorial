package com.paulinavelazquez.spring.restful.service;

import com.paulinavelazquez.spring.restful.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();
    Customer saveCustomer(Customer customer);
}
