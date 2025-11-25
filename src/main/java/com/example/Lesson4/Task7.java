package com.example.Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite col-vo elementov v massive: ");
        int n = scanner.nextInt();

        int [] arr = new int [n];
        for (int i = 0; i <n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Massiv: ");
        System.out.println(Arrays.toString(arr));

        arr[n-1] = arr[n-1] + 1;
        for (int i = n -1 ; i >= 0; i--) {
            if (arr[i] == 9 || arr[i] == 10 && arr[0] != 10) {
                arr[i] = 0;
                arr[i-1] = arr[i-1] + 1;
            }
        }

        System.out.print("Massiv konechni: ");
        System.out.println(Arrays.toString(arr));
            }
}
