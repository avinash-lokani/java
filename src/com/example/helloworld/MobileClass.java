package com.example.helloworld;

class Mobile1 implements Mobile{
    @Override
    public void m1() {
        System.out.println("overrided");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }
}

public class MobileClass{
    public static void main(String[] args){
        Mobile1 mobile1 = new Mobile1();
        mobile1.m1();
        mobile1.m2();
        System.out.println(mobile1.a);
    }
}