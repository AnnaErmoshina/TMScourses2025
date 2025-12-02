package com.example.Lesson5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite col-vo strok v massive: ");
        int n = scanner.nextInt();
        System.out.print("Vvedite col-vo stolbcov v massive: ");
        int k = scanner.nextInt();

        int[][] arr = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < k; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else
            {
                for (int j = k -1; j >= 0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}


