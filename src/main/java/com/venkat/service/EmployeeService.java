package com.venkat.service;

import com.venkat.model.Address;
import com.venkat.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by venkatram.veerareddy on 8/23/2017.
 */

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired AddressRepository addressRepository;

    public List<Employee> getAllEmployees(){
       /* List<Employee> empList = new ArrayList<>();
        employeeRepository.findAll()
                .forEach(empList::add);
        return empList;*/
       return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id){
        return employeeRepository.getOne(id);
    }

    public Employee addEmployee(Employee emp){
        Address address = emp.getAddress();
        if(emp != null){
            address = addressRepository.save(address);
        }
        return employeeRepository.save(emp);
    }


    public Employee getEmployeeByEmail(String email){
        return employeeRepository.findByEmail(email);
    }

    public boolean deleteEmployeeById(Integer id){
        employeeRepository.delete(id);
        return true;
    }
}
