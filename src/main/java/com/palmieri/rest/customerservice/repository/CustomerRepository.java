package com.palmieri.rest.customerservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.palmieri.rest.customerservice.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
