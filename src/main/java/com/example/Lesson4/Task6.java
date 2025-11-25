package com.example.Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite col-vo elementov v massive: ");
        int n = scanner.nextInt();

        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        System.out.print("Massiv: ");
        System.out.println(Arrays.toString(arr));

        int flag = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[i-1]){
                flag =+ 0;
            } else {
                flag =+ 1;
            }
        }
        if (flag == 0){
            System.out.println("Eto posledovatelnost");
        } else{
            System.out.println("Eto NE posledovatelnost");
        }
    }
}
