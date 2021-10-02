package com.company;

public class Part1 {

    public static void main(String[] args) {
        printName();
        // printYear();
        printAddress();
    }

    static void printName() {
        String name = "Edward";
        String lastName = "Kats";

        System.out.println("My name is " + name + " " + lastName);
    }

    //printYear

    static void printAddress() {
        String city = "Tel-Aviv";
        String country = "Israel";

        System.out.println("I live in " + city + ", " + country);
    }
}
