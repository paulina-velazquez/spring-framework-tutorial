package com.paulinavelazquez.spring.restful.repositories;

import com.paulinavelazquez.spring.restful.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
