package com.bankingapp.Mappers;

import com.bankingapp.DTO.AccountOperationDTO;
import com.bankingapp.DTO.CurrentBankAccountDTO;
import com.bankingapp.DTO.CustomerDTO;
import com.bankingapp.DTO.SavingBankAccountDTO;
import com.bankingapp.entities.CurrentAccount;
import com.bankingapp.entities.Customer;
import com.bankingapp.entities.Operation;
import com.bankingapp.entities.SavingAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


@Service
public class BankAccountMappersImpl {
    public CustomerDTO fromCustomer(Customer customer){
        CustomerDTO customerDTO = new CustomerDTO();
        BeanUtils.copyProperties(customer,customerDTO);
        return customerDTO;
    }

    public Customer fromCustomerDTO(CustomerDTO customerDTO){
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO,customer);
        return customer;
    }

    public SavingBankAccountDTO fromSavingBankAccount(SavingAccount savingAccount){
        SavingBankAccountDTO savingBankAccountDTO=new SavingBankAccountDTO();
        BeanUtils.copyProperties(savingAccount,savingBankAccountDTO);
        savingBankAccountDTO.setCustomerDTO(fromCustomer(savingAccount.getCustomer()));
        savingBankAccountDTO.setType(savingAccount.getClass().getSimpleName());
        return savingBankAccountDTO;
    }
    public SavingAccount fromSavingBankAccountDTO(SavingBankAccountDTO savingBankAccountDTO){
        SavingAccount savingAccount=new SavingAccount();
        BeanUtils.copyProperties(savingBankAccountDTO,savingAccount);
        savingAccount.setCustomer(fromCustomerDTO(savingBankAccountDTO.getCustomerDTO()));
        return savingAccount;
    }

    public CurrentBankAccountDTO fromCurrentBankAccount(CurrentAccount currentAccount){
        CurrentBankAccountDTO currentBankAccountDTO=new CurrentBankAccountDTO();
        BeanUtils.copyProperties(currentAccount,currentBankAccountDTO);
        currentBankAccountDTO.setCustomerDTO(fromCustomer(currentAccount.getCustomer()));
        currentBankAccountDTO.setType(currentAccount.getClass().getSimpleName());
        return currentBankAccountDTO;
    }
    public CurrentAccount fromCurrentBankAccountDTO(CurrentBankAccountDTO currentBankAccountDTO){
        CurrentAccount currentAccount=new CurrentAccount();
        BeanUtils.copyProperties(currentBankAccountDTO,currentAccount);
        currentAccount.setCustomer(fromCustomerDTO(currentBankAccountDTO.getCustomerDTO()));
        return currentAccount;
    }

    public AccountOperationDTO fromAccountOperation(Operation accountOperation){
        AccountOperationDTO accountOperationDTO=new AccountOperationDTO();
        BeanUtils.copyProperties(accountOperation,accountOperationDTO);
        return accountOperationDTO;
    }
}
