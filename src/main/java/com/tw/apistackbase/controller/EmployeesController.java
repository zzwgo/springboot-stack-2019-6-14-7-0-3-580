package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    @GetMapping
    public List<Employee>getAllEmployees(){
        return Employee.createTestEmployees();
    }

    @PostMapping
    public List<Employee> addEmployees(@RequestBody Employee employee){
        Employee.createTestEmployees();
        return Employee.AddTestEmployees(employee);
    }

    @DeleteMapping("/{id}")
    public List<Employee> deleteEmployees(@PathVariable int id){
        Employee.createTestEmployees();
        return Employee.DeleteTestEmployees(id);
    }

    @PutMapping
    public List<Employee> changeEmployees(@RequestBody Employee employee){
        Employee.createTestEmployees();
        return Employee.changeTestEmployees(employee);
    }

    @GetMapping("/{id}")
    public Employee searchEmployees(@PathVariable int id){
        Employee.createTestEmployees();
        return Employee.searchTestEmployees(id);
    }

}
