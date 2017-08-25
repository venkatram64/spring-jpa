package com.venkat.service;

import com.venkat.model.Bank;
import com.venkat.model.Customer;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Bank.class, BankService.class})
@EntityScan(basePackages = {"com.venkat.model"})
@EnableAutoConfiguration
@AutoConfigureTestDatabase
@Transactional
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BankServiceTest {

    @Autowired
    BankService bankService;

    @Test
    public void test1CreateBank(){

        Customer customer = new Customer();
        customer.setFirstName("Venkatram");
        customer.setLastName("Veerareddy");

        Customer customer2 = new Customer();
        customer2.setFirstName("Srijan");
        customer2.setLastName("Veerareddy");

        Bank bank = new Bank();
        bank.setName("My Bank");
        bank.getCustomers().add(customer);
        bank.getCustomers().add(customer2);


        bank = bankService.addBank(bank);

        assertEquals("My Bank", bank.getName());

        assertEquals(2, bank.getCustomers().size());
    }
}
