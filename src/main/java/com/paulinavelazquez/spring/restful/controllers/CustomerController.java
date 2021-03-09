package com.paulinavelazquez.spring.restful.controllers;

import com.paulinavelazquez.spring.restful.domain.Customer;
import com.paulinavelazquez.spring.restful.service.CustomerServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j // Use to log information. Log.info("Enter your message")
@RestController // The @RestController annotation was introduced in Spring 4.0 to simplify the creation of RESTful web services. It's a convenience annotation that combines @Controller and @ResponseBody
                // – which eliminates the need to annotate every request handling method of the controller class with the @ResponseBody annotation.
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "api/v1/customers";

    private final CustomerServiceInterface customerServiceInterface;

    public CustomerController(CustomerServiceInterface customerServiceInterface) {
        this.customerServiceInterface = customerServiceInterface;
    }

    @GetMapping
    List<Customer> getAllCustomers() {
        return customerServiceInterface.findAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        System.out.println("Controller - Search for a customer by ID");
//        log.info("Controller - Searching for a customer by ID");
        return customerServiceInterface.findCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer) {
        System.out.println("Controller - Accepting anew customer = " + customer);
//        log.info("Controller - Accepting a new customer = {}", customer);
        return customerServiceInterface.saveCustomer(customer);
    }
}