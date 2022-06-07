package com.example.Association;

import java.util.ArrayList;
import java.util.List;

// Aggregation

class Company{
    private String name;
    private List<Employee> employeeList;
    public Company(String name,List<Employee> employeeList){
        this.name = name;
        this.employeeList = employeeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}

class Employee{
    private String name;
    private int age;
    public Employee(String name,int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*@Override
    public String toString() {
        return "Employee "+ name +" has age "+ age;
    }*/
}

public class HasA {
    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Avinash",21));
        employeeList.add(new Employee("kalyan",25));

        Company company = new Company("Zemoso",employeeList);

        System.out.println(company.getName());
        System.out.println(company.getEmployeeList());

    }
}
