package com.example.Lesson7_Task1;

public class Main {
    public static void main(String[] args) {
        Printable employee1 = new Director();
        Printable employee2 = new Worker();
        Printable employee3 = new Accountant();

        employee1.print();
        employee2.print();
        employee3.print();
    }
}
