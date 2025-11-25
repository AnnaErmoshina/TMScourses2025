package com.example.Lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Vvedite polojitelnoe chislo: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Chislo ne celoe");
                System.out.print("Vvedite polojitelnoe chislo: ");
                scanner.next();
            }

            num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("Chislo ne polojitelnoe");
            }

        } while (num <= 0);

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
