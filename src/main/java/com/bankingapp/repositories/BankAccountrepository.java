package com.bankingapp.repositories;

import com.bankingapp.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountrepository extends JpaRepository<BankAccount,String> {
}
