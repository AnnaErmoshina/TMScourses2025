package com.example.Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite col-vo elementov v massive: ");
        int n = scanner.nextInt();

        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.print("Massiv: ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++){
            int cup = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = cup;
            n--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
