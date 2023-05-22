package com.bankingapp.web;

import com.bankingapp.DTO.CustomerDTO;
import com.bankingapp.Exceptions.CustomerNotFoundException;
import com.bankingapp.services.BankAccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class CustomerRestController {

    private BankAccountService bankAccountService;

    @GetMapping("/customers")
    public List<CustomerDTO> customers(){
        return bankAccountService.listCustomers();
    }

    @GetMapping("/customer/{id}")
    public CustomerDTO getCustomer(@PathVariable(name = "id") Long customerId) throws CustomerNotFoundException {
        return bankAccountService.getCustomer(customerId);
    }

    @PostMapping("/customers")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        return bankAccountService.saveCustomer(customerDTO);
    }
    @PutMapping("/customer/{customerId}")
    public CustomerDTO updateCustomer(@PathVariable Long customerId, @RequestBody CustomerDTO customerDTO){
        customerDTO.setId(customerId);
        return bankAccountService.updateCustomer(customerDTO);
    }
    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable Long id){
        bankAccountService.deleteCustomer(id);
    }
}


