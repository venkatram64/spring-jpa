package com.venkat.service;

import com.venkat.model.Address;
import com.venkat.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@Service
public class BankService {

    @Autowired
    private BankRepository bankRepository;

    public List<Bank> getAllBanks(){
        return bankRepository.findAll();
    }

    public Bank addBank(Bank bank){
        return bankRepository.save(bank);
    }

    public Bank getBankById(Integer id){
        return bankRepository.getOne(id);
    }
    public boolean deleteBankById(Integer id){
        bankRepository.delete(id);
        return true;
    }

}
