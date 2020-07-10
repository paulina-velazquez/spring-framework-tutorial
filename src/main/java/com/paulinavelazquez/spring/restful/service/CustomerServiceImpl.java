package com.paulinavelazquez.spring.restful.service;

import com.paulinavelazquez.spring.restful.domain.Customer;
import com.paulinavelazquez.spring.restful.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service    // Spring is going to manage this component as a Spring Bean
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
