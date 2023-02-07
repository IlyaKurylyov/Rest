package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Вывести в консоль максимальное и минимальное значения типа int, используя класс Integer
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);


        //В переменную записать 3х значное натуральное число, вывести в консоль сумму цифр числа

        String Line = "Введите число";
        System.out.println(Line);
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Вы получили: " + sum);
        // В переменные x и y записать два натуральных числа, вывести в консоль остаток от деления x и y
        int x = 15;
        int y = 6;
        int z = x % y;
        int s = x * y;
        System.out.println("Здесь вы получили: " +  z);
    }

    // Напишите метод, который будет вычислять площадь прямоугольника
    public static void square() {
        int a = 10;
        int b = 10;
        int s = a * b;
        System.out.println("Площадь прямоугольника: " +s);
    }
}

