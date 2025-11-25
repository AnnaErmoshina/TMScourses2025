package com.example.Lesson1;

public class Task6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("nachalnoe a: "+a);
        System.out.println("nachalnoe b: "+b);
        // метод стаканчика, где t - стаканчик для хранения :)
        int t = a;
        a = b;
        b =t;
        System.out.println("conechnoe a: "+a);
        System.out.println("conechnoe b: "+b);
    }
}
