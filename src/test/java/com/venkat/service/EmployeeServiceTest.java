package com.venkat.service;

import com.venkat.model.Address;
import com.venkat.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Employee.class, EmployeeService.class})
@EntityScan(basePackages = {"com.venkat.model"})
@EnableAutoConfiguration
@AutoConfigureTestDatabase
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testCreateEmployee(){
        Address address = new Address("East Squire Drive","Rochester","12322");

        Employee employee = new Employee("Venkatram", "Veerareddy", "venkat.veerareddy@gmail.com", 51, address);

        employee = employeeService.addEmployee(employee);

        assertEquals("Venkatram", employee.getFirstName());

    }
}
