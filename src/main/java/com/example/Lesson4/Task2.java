package com.example.Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite col-vo elementov v massive: ");
        int n = scanner.nextInt();

        double [] arr = new double [n];
        for (int i = 0; i < n; i++){
            arr[i] =  Math.random() ;
        }

        System.out.print("Massiv: ");
        System.out.println(Arrays.toString(arr));

        double min = arr[0];
        double max = arr[0];

        for (int i = 1; i < n; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Min elem = " + min);
        System.out.println("Min elem = " + max);
    }
}
