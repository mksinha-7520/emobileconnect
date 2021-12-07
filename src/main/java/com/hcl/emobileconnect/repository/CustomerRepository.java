package com.hcl.emobileconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcml.emobileconnect.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
