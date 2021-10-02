package com.company;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        // Homework 1
//        System.out.println("Enter your name: ");
//        String name = new Scanner(System.in).nextLine();
//
//        System.out.print("Я, ");
//        System.out.print(name + ", ");
//        System.out.print("стану ");
//        System.out.print("программистом");

        // homework 2
//        System.out.println("Введите базовую зарплату: ");
//        int baseSalary = new Scanner(System.in).nextInt();
//
//        int secondYearSalary = baseSalary * 2;
//        int thirdYearSalary = baseSalary * 3;
//
//        System.out.println("Моя зарплата в первый год " + baseSalary);
//        System.out.println("Моя зарплата во второй год " + secondYearSalary);
//        System.out.println("Моя зарплата в третий год " + thirdYearSalary);

        // homework 3
        System.out.println("Enter your name: ");
        String firstName = new Scanner(System.in).nextLine();

        System.out.println("Enter your last name: ");
        String lastName = new Scanner(System.in).nextLine();

        System.out.println("Enter your father name: ");
        String fatherName = new Scanner(System.in).nextLine();

        System.out.println("Year of birth: ");
        int year = new Scanner(System.in).nextInt();

        System.out.println("Country: ");
        String country = new Scanner(System.in).nextLine();

        System.out.println("City: ");
        String city = new Scanner(System.in).nextLine();

        // Петренко Павел Викторович
        String fullName = firstName + " " + lastName + " " + fatherName;

        // Новосибирск, Россия
        String fullAddress = city + ", " + country;

        System.out.println("ФИО: " + fullName);
        System.out.println("Год рождения: " + year);
        System.out.println("Адрес проживания: " + fullAddress);
    }
}
