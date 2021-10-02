package com.company;


import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        // 12 + 12 = 24
        // abc - 123 = abc123
        // int + double = double
        // abc + 10 + 2 = String
        // String + double = String

        // 2 + 2 = 22

//        int baseSalary = 10;
////        int secondYearSalary = baseSalary * 2;
//        System.out.println("My name is " + (baseSalary + 2));
//        //                    String         int        int
//
//        double productPrice = new Scanner(System.in).nextDouble();
//        System.out.println(productPrice);


        /**
         * - Объявить
         *      double price = 55.99
         * - Напечатать
         *      «Цена товара price. Введите сумму оплаты»
         * - Считать с консоли
         *      double payAmount
         * - Напечатать сколько сдачи вернуть клиенту
         *
         *    (payAmount – price)
         */

//        double price = 107.54;
//        System.out.println("Цена товара " + price + ". Введите сумму оплаты");
//        double payAmount = new Scanner(System.in).nextDouble();
//
//        System.out.println("Сдача: " + (payAmount - price));

        boolean yesNo;

        // Объявление переменной
        // String name;

        // Присвоение переменной
        // String name = "Abc";

        // ==
//        System.out.println(true);
//        System.out.println(1==1);
//        System.out.println(2==1);
//        int i = 1;
//        System.out.println(i == 1);
//
//        boolean b = false;
//        System.out.println(b);

        // == - сравнить - (да/нет)
        // 1 == 1 = да/нет

        // != НЕ равно
        // == равно


        menu();
        ageValidator();
    }

    static void menu() {
        System.out.println("1. Сказать привет");
        System.out.println("2. Сказать пока");

        int option = new Scanner(System.in).nextInt();
        if (option == 1) {
            System.out.println("Привет уже!");
        }

        if (option == 2) {
            System.out.println("Давай, до встречи!");
        }
    }

    static void ageValidator() {
        /**
         * - Считать age с консоли
         * - Если age >= 18 – печатать «Проходи»
         * - Иначе – «Рано еще»
         */

        System.out.println("Введите ваш возраст: ");
        int age = new Scanner(System.in).nextInt();

        if (age >= 18) {
            System.out.println("Проходи");
        }
        else {
            System.out.println("Рано еще");
        }
    }
}
