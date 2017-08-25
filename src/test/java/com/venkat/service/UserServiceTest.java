package com.venkat.service;


import com.venkat.model.Role;
import com.venkat.model.User;
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
import java.util.List;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {User.class, UserService.class})
@EntityScan(basePackages = {"com.venkat.model"})
@EnableAutoConfiguration
@AutoConfigureTestDatabase
@Transactional
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void test1InsertUser(){
        Role role = new Role();
        role.setRoleName("Admin");

        Role role2 = new Role();
        role2.setRoleName("System");

        User user = new User();
        user.setEmail("venkat.veerareddy@gmail.com");
        user.setPassword("abc123");

        //add roles
        user.getRoles().add(role);
        user.getRoles().add(role2);

        user = userService.addUser(user);

        assertEquals("venkat.veerareddy@gmail.com",user.getEmail());

        user = userService.getUserById(user.getId());
        assertEquals("abc123", user.getPassword());
        List<Role> roles = user.getRoles();
        assertEquals(2, roles.size());
    }
}
