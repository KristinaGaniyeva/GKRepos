package com.company;

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
	// Вывести число по модулю, если оно отрицательное, или число *2, если оно положительное;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        if(a<0)
            System.out.println("Отрицательное число по модулю: " + Math.abs(a));
        else
            System.out.println("Положительное число *2: " + a*2);
    }
}
