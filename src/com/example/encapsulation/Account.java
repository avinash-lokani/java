package com.example.encapsulation;

public class Account {
    private int balence = 100000;
    private String type = "savings";

    public int getBalence() {
        return balence;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBalence(int balence) {
        this.balence = balence;
    }
}
