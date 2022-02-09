package com.company;

public class Singger extends Person{
    public Singger(String name, String designation , String bandName){
        super(name, designation);
        this.bandName=bandName;
    }
    String bandName;
    public  void singing(){
        System.out.println("I am singing ");
    }
    public  void playGitar(){
        System.out.println("I am playing gitar");
    }

    @Override
    public String toString() {
        return "Singger{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", bandName='" + bandName + '\'' +
                '}';
    }
}
