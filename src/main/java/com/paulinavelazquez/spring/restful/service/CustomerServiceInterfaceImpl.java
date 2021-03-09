package com.paulinavelazquez.spring.restful.service;

import com.paulinavelazquez.spring.restful.domain.Customer;
import com.paulinavelazquez.spring.restful.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j  // Use to log information. Log.info("Enter your message")
@Service    // Spring is going to manage this component as a Spring Bean
public class CustomerServiceInterfaceImpl implements CustomerServiceInterface {

    private final CustomerRepository customerRepository;

    public CustomerServiceInterfaceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {
        log.info("Implementation - Searching for customer by ID");
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {
        log.info("Implementation - Searching for all customers");
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        log.info("Implementation - Saving a new customer");
        return customerRepository.save(customer);
    }
}
