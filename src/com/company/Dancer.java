package com.company;

public class Dancer extends Person{
    public Dancer(String name, String designation, String groupname){
        super(name, designation);
        this.groupname=groupname;
    }
    String groupname;
    public void dancing(){
        System.out.println("I am dancing");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupname='" + groupname + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
