package com.paulinavelazquez.spring.restful.bootstrap;

import com.paulinavelazquez.spring.restful.domain.Customer;
import com.paulinavelazquez.spring.restful.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Customer c1 = new Customer();
        c1.setFirstName("Paulina");
        c1.setLastName("Velazquez");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Rami");
        c2.setLastName("Del Toro");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Carolina");
        c3.setLastName("Velazquez");
        customerRepository.save(c3);

        System.out.println("Customers Saved: " + customerRepository.count());
    }
}
