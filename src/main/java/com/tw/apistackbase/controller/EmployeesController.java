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
        return Employee.AddTestEmployees(employee);
    }

    @DeleteMapping
    @RequestMapping("/{id}")
    public List<Employee> deleteEmployees(@PathVariable int id){
        Employee.createTestEmployees();
        return Employee.DeleteTestEmployees(1);
    }
}
