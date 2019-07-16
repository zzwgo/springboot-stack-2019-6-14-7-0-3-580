package com.tw.apistackbase.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    static List<Employee> employees;
    public Employee(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public static List<Employee> createTestEmployees() {
        employees=new  ArrayList<>();
        employees.add(new Employee(1,"xiaoming",22,"girl"));
        employees.add(new Employee(2,"xiaohong",24,"girl"));
        return employees;
    }

    public static List<Employee> AddTestEmployees(Employee employee) {
        employees.add(employee);
        return employees;
    }

    public static List<Employee> DeleteTestEmployees(int id) {
        for(Employee employee:employees){
            if(employee.getId()==id){
                employees.remove(employee);
            }
        }
        return employees;
    }

    public static List<Employee> changeTestEmployees(Employee employee) {
        for(Employee nowEmployee:employees){
            if(nowEmployee.getId()==employee.getId()){
                employees.remove(nowEmployee);
                employees.add(employee);
                break;
            }
        }
        return employees;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
