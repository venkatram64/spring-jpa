package com.venkat.service;

import com.venkat.model.Address;
import com.venkat.model.Employee;
import org.junit.FixMethodOrder;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by venkatram.veerareddy on 8/23/2017.
 */

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Address.class, AddressService.class})
@EntityScan(basePackages = {"com.venkat.model"})
@EnableAutoConfiguration
@AutoConfigureTestDatabase
//@EnableConfigurationProperties
//@EnableJpaRepositories(basePackages={"com.venkat.service"})
//@DataJpaTest
@Transactional
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AddressServiceTest {

    @Autowired
    AddressService addressService;

    /*@Autowired
    TestEntityManager entityManager;*/

    @Test
    public void test1CreateAddress(){
        Address a = new Address();
        a.setLine1("RV Devaki");
        a.setLine2("NGuda");
        a.setZipCode("500029");
        //Address address = entityManager.persist(a);
        Address address = addressService.addAddress(a);

        assertEquals("RV Devaki", address.getLine1());
    }

    //@Test
    public void test2DeleteAddress(){

        List<Address> address = addressService.getAllAddresses();
        assertEquals(1, address.size());
        addressService.deleteAddressById(new Integer(1));
        List<Address> address1 = addressService.getAllAddresses();
        assertEquals(0, address1.size());
    }

    @Test
    public void test3CreateAddressAndEmployee(){

        Employee employee = new Employee("Venkatram", "Veerareddy", "venkat.veerareddy@gmail.com", 51);
        Address a = new Address();
        a.setLine1("RV Devaki");
        a.setLine2("NGuda");
        a.setZipCode("500029");
        a.setEmployee(employee);
        //Address address = entityManager.persist(a);
        Address address = addressService.addAddress(a);

        assertEquals("RV Devaki", address.getLine1());

        assertEquals("Venkatram", address.getEmployee().getFirstName());
    }
}
