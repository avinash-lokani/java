package com.example.Association;

class Companies{
    public String name;
    public Employees employees;
    public Companies(String name,String names,int age){
        employees = new Employees(names,age);
        this.name = name;
    }

}

class Employees{
    private String name;
    private int age;

    public Employees(String name, int age){
        this.name = name;
        this.age = age;
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
}

public class Composition {
    public static void main(String[] args){
        Companies companies = new Companies("zemoso","Avinash",21);

        System.out.println(companies.employees.getAge());
    }

}
