package com.example.Lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int t = scanner.nextInt();

        if (t > -5){
            System.out.println("Warm");
        }
        else if (t > -20 && t <= -5){
            System.out.println("Normal");
        }
        else if (t <= -20 ){
            System.out.println("Cold");
        }
    }
}
