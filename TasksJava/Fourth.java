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
        System.out.println(mlenght(mass));
    }

    private static boolean mlenght(int[] mass) {
        boolean ret = false;
        int first = mass[0];
        int last = mass[mass.length - 1];
        for (int i = 0; i < mass.length-1; i++) {
            if (mass.length > 0 && first == last)
                ret=true;
            else
                ret=false;
            break;
        }
        return ret;
    }
}
