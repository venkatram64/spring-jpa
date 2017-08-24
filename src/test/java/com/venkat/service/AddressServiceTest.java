package com.venkat.service;

import com.venkat.model.Address;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
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

/**
 * Created by venkatram.veerareddy on 8/23/2017.
 */

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {Address.class, AddressService.class})
@EntityScan(basePackages = {"com.venkat.model"})
@EnableConfigurationProperties
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages={"com.venkat.service"})
@DataJpaTest
//@AutoConfigureTestDatabase
public class AddressServiceTest {

    @Autowired
    AddressService addressService;

    /*@Autowired
    TestEntityManager entityManager;*/

    @Test
    public void createAddress(){
        Address a = new Address();
        a.setLine1("RV Devaki");
        a.setLine2("NGuda");
        a.setZipCode("500029");
        //Address address = entityManager.persist(a);
        Address address = addressService.addEmployee(a);

        assertEquals("RV Devaki", address.getLine1());
    }
}
