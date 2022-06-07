package com.example.helloworld;

import com.example.main.main;

public class Demo {
    public static void main(String[] args) {
        int n = 10,m = 20;
        System.out.println(m+n);


        Eg eg = new Eg();
        eg.java();

    }

    protected void C(){
        System.out.println("java course");
    }

}

class Eg extends main{
    public void java(){
        System.out.println("calling parent class from different methods");
        Example();
    }
}
