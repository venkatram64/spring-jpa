package com.venkat.service;

import com.venkat.model.Bank;
import com.venkat.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Integer id){
        return customerRepository.getOne(id);
    }
    public boolean deleteCustomerById(Integer id){
        customerRepository.delete(id);
        return true;
    }
}
