package com.venkat.service;

import com.venkat.model.Address;
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

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Role.class, RoleService.class})
@EntityScan(basePackages = {"com.venkat.model"})
@EnableAutoConfiguration
@AutoConfigureTestDatabase
@Transactional
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoleServiceTest {

    @Autowired
    private RoleService roleService;

    @Test
    public void test1InsertRole(){
        User user = new User();
        user.setEmail("venkat.veerareddy@gmial.com");
        user.setPassword("abc123");

        User user2 = new User();
        user2.setEmail("srijan.veerareddy@gmial.com");
        user2.setPassword("xyz123");

        Role role = new Role();
        role.setRoleName("Admin");

        //add users
        role.getUsers().add(user);
        role.getUsers().add(user2);

        role = roleService.addRole(role);

        role = roleService.getRoleById(role.getId());

        assertEquals("Admin", role.getRoleName());

        assertTrue(role.getUsers().size() > 1);

    }
}
