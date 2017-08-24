package com.venkat.service;

import com.venkat.model.Address;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by venkatram.veerareddy on 8/23/2017.
 */
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllEmployees(){
       return addressRepository.findAll();
    }

    public Address addEmployee(Address addr){
        return addressRepository.save(addr);
    }


}