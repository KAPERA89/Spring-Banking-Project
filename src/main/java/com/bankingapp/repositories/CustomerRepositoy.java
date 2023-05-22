package com.bankingapp.repositories;

import com.bankingapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositoy extends JpaRepository<Customer, Long> {
}
