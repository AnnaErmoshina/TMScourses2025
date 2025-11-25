package com.example.Lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        if (n%2 == 0){
            System.out.println("chislo " + n + " chetnoe" );
        } else {System.out.println("chislo " + n + " nechetnoe" );
        }
    }
}
