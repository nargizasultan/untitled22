package com.company;

public class Person {
    String name;
    String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn(){
        System.out.println(name+" is learning");
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void walk(){
        System.out.println(name+" is walking");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
