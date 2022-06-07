package com.example.factory;

public class FactoryDp {
    public Vehicle getVehicle(String nameV){
        if(nameV == null)
            return null;
        else{
            if(nameV.equalsIgnoreCase("Honda")){
                return new Honda();
            }
            else if(nameV.equalsIgnoreCase("Tata")){
                return new Tata();
            }
        }
        return null;
    }
}
