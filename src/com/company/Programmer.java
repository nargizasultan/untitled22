package com.company;

import java.lang.annotation.Inherited;

public class Programmer extends Person{
    String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName=companyName;
    }

    public void coding(){
        System.out.println("I am coding");

    }
    

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
