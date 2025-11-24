package com.example.Lesson1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        double n = scanner.nextDouble();

        double drob = n - (int)n;
        n = drob > 0.5 ? n - drob + 1 : n - drob;
        System.out.println(n);

    }
}
