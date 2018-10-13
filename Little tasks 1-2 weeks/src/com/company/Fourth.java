package com.company;

import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {
// Функцию, возвращающую true, если длина массива целых чисел больше нуля и первый и последний элементы равны
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scan.nextInt();
        int[] mass = new int[n];
        System.out.println("Введите элементы");
        for (int i = 0; i < n; i++) {
            mass[i] = scan.nextInt();
        }
        System.out.println(returnNotNull(mass));
    }

    private static boolean returnNotNull(int[] mass) {

        if (mass.length > 0 && mass[0] == mass[mass.length - 1])
            return true;
        else
            return false;
    }
}
