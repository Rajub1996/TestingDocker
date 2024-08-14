package com.example.TestingDocker.service;

import com.example.TestingDocker.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employeeList = List.of(
            new Employee("1", "rishi", "rishi@pixyapps.com"),
            new Employee("2", "raju", "raju.b@pixyapps.com")
    );

    public List<Employee> fetchALl() {
        return employeeList;
    }
}
