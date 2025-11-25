package com.example.Lesson1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter q: ");
        int q = scanner.nextInt();
        System.out.print("Enter w: ");
        int w = scanner.nextInt();

        int result = q / w;
        int ost = q % w;

        System.out.println(q + " / " + w + " = " + result + ", ostatok = " + ost);
    }
}
