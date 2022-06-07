package com.example.encapsulation;

public class Emp {
    public static void main(String[] args){
        Account avinash = new Account();
        avinash.setBalence(1000);
        System.out.println(avinash.getBalence());
        System.out.println(avinash.getType());
    }
}
