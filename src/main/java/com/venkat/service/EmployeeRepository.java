package com.venkat.service;

import com.venkat.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by venkatram.veerareddy on 8/23/2017.
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee findByEmail(String email);
}
