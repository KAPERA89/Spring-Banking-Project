package com.bankingapp.DTO;

public record TransferRequestDTO(String accountSource,String accountDestination, double amount, String description) {
}
