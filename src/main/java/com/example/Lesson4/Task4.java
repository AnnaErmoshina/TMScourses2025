package com.example.Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
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

        int count = 0;
        for (int i = 0; i < n; i++){
            if(arr[i] == 0){
                count++;
            }
        }

        if (count == 0){
            System.out.println("Nulevih elementov net");
        } else {
            System.out.println("Kol-vo nulevih elementov = " + count);
        }
    }
}
