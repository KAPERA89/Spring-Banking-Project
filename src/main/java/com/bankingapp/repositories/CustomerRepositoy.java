package com.bankingapp.repositories;

import com.bankingapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepositoy extends JpaRepository<Customer, Long> {
    List<Customer> findByNameContains(String keyword);
}
