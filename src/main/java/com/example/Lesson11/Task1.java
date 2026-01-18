package com.example.Lesson11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        System.out.println("Введите 3 строки:");
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }

        String shortest = strings[0];
        String longest = strings[0];

        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        System.out.println("\nСамая короткая: \"" + shortest + "\" (" + shortest.length() + ")");
        System.out.println("Самая длинная: \"" + longest + "\" (" + longest.length() + ")");
    }
}
