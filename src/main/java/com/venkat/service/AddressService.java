package com.venkat.service;

import com.venkat.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by venkatram.veerareddy on 8/23/2017.
 */
@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses(){
       return addressRepository.findAll();
    }

    public Address addAddress(Address addr){
        return addressRepository.save(addr);
    }

    public Address getAddressById(Integer id){
        return addressRepository.getOne(id);
    }
    public boolean deleteAddressById(Integer id){
        addressRepository.delete(id);
        return true;
    }
}
