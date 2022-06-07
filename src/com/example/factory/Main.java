package com.example.factory;

public class Main {
    public static void main(String[] args){
        FactoryDp factoryDp = new FactoryDp();
        Vehicle tata = factoryDp.getVehicle("Tata");
        tata.Details();
        Vehicle honda = factoryDp.getVehicle("honda");
        honda.Details();
    }
}
