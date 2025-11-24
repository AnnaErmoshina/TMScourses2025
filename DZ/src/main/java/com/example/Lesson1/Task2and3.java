package com.example.Lesson1;

import java.util.Scanner;

public class Task2and3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        int sum = 0;
        while (n!=0){
            int num = n%10;
            sum = sum + num;
            n = n/10;
        }
        System.out.println("Result: " + sum);
    }
}
