package com.bankingapp.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CA")
@Data @NoArgsConstructor @AllArgsConstructor
public class CurrentAccount extends BankAccount{
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private Long id;
    private double overDraft;
}
