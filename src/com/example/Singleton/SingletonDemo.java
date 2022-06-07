package com.example.Singleton;

class Singleton{
    private static Singleton singleton = new Singleton();

    private Singleton(){

    }

    public int val(int value){
        return Math.abs(value);
    }

    public static Singleton getInstance(){
        return singleton;
    }
}

public class SingletonDemo {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton.val(-101));

        Demo2 demo2 = new Demo2();
        demo2.demo();
    }
}

class Demo2{
    public void demo(){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
