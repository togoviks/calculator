package com.company;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        boolean active = true;
        int a;
        int b;
        int result = 0;
        while(active) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберете нужное действие:\n 1. Сумма двух чисел \n 2. Вычитание двух чисел \n 3.Умножение двух числе \n 4.Деление двух чисел \n 5.Квадрат числа \n 6.Преобразование в процент \n 7.Возведение в степень числа \n 8.Корень числа \n 9.Большее из двух чисел \n 10.Натуральный логарифм числа \n 0.Выход");
            int menu = sc.nextInt();
            switch (menu) {
                case (1) -> {
                    System.out.println("Введите первое число:");
                    a = sc.nextInt();
                    System.out.println("Введите второе число:");
                    b = sc.nextInt();
                    result = a + b;
                }
                case (2) -> {
                    System.out.println("Введите первое число:");
                    a = sc.nextInt();
                    System.out.println("Введите второе число:");
                    b = sc.nextInt();
                    result = a - b;
                }
                case (3) -> {
                    System.out.println("Введите первое число:");
                    a = sc.nextInt();
                    System.out.println("Введите второе число:");
                    b = sc.nextInt();
                    result = a * b;
                }
                case (4) -> {
                    System.out.println("Введите первое число:");
                    a = sc.nextInt();
                    System.out.println("Введите второе число:");
                    b = sc.nextInt();
                    result = a / b;
                }
                case (5) -> {
                    System.out.println("Введите число:");
                    a = sc.nextInt();
                    result = a * a;
                }
                case (6) -> {
                    System.out.println("Введите число:");
                    a = sc.nextInt();
                    result = a / 100;
                }
                case (7) -> {
                    System.out.println("Введите первое число:");
                    a = sc.nextInt();
                    System.out.println("Введите второе число:");
                    b = sc.nextInt();
                    result = (int) Math.pow(a, b);
                }
                case (8) -> {
                    System.out.println("Введите число:");
                    a = sc.nextInt();
                    result = (int) Math.sqrt(a);
                }
                case (9) -> {
                    System.out.println("Введите первое число:");
                    a = sc.nextInt();
                    System.out.println("Введите второе число:");
                    b = sc.nextInt();
                    result = Math.max(a, b);
                }
                case (10) -> {
                    System.out.println("Введите число:");
                    a = sc.nextInt();
                    result = (int) Math.log(a);
                }
                case (0) -> active = false;
            }
            if (menu != 0) System.out.println("Результат: " + result);
        }
    }
}
