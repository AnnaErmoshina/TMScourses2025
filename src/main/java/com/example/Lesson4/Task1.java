package com.example.Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
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

        System.out.println("Massiv v obratnom pryadke: ");
        for (int i = n -1 ; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}

