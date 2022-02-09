package com.company;

public class Main {

    public static void main(String[] args) {
        Person person= new Person("Anna", "Human");
        Programmer programmer= new Programmer("Bob", "programmer", "Facebook");
        Dancer dancer= new Dancer("Alina", "Dancer", "KOK-KYYAL");
        Singger singer= new Singger("Anton", "singer", "branX");
        System.out.println(person);
        System.out.println(programmer);
        programmer.coding();
        System.out.println(dancer);
        dancer.dancing();
        System.out.println(singer);
        singer.playGitar();
        singer.singing();
        programmer.eat();
        programmer.learn();
        programmer.walk();
        System.out.println();

        dancer.eat();
        dancer.learn();
        dancer.walk();
        System.out.println();

        singer.eat();
        singer.learn();
        singer.walk();
        System.out.println();




    }
}
