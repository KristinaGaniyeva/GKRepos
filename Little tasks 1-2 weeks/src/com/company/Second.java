package com.company;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        // Функция, выводящая в консоль “Hello, <argument>”, где <argument> - строка, поданная на стандартный вход;
        System.out.println("Введите argument: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(stringWithArgument(s));
    }

    private static StringBuilder stringWithArgument(String s) {
        StringBuilder sb = new StringBuilder("Hello, ");
        sb.append(" ");
        sb.append(s);
        sb.toString();
        return sb;
    }
}
