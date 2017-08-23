package com.venkat.controller;

import com.venkat.model.Employee;
import com.venkat.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Created by venkatram.veerareddy on 8/23/2017.
 */

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value="/employees", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping(value="/createEmp", method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Employee addEmployee(@RequestBody Employee emp){
        return employeeService.addEmployee(emp);
    }

    @RequestMapping(value="/{email:.+}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> findEmployeeById(@PathVariable("email") String email){
        return ResponseEntity.ok().body(employeeService.getEmployeeByEmail(email));
    }

    @RequestMapping(value="/{empId}", method = RequestMethod.DELETE, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Integer empId){
        boolean deleted = employeeService.deleteEmployeeById(empId);
        if(deleted) {
            return new ResponseEntity<String>("Unable to delete",HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<String>("Deleted",HttpStatus.NO_CONTENT);
        }
    }


}
