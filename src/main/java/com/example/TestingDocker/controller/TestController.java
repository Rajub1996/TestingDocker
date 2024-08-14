package com.example.TestingDocker.controller;

import com.example.TestingDocker.entity.Employee;
import com.example.TestingDocker.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/get")
    public List<Employee> getALlEmployees(){
        return employeeService.fetchALl();
    }
}
