package com.example.Lesson7_Task2;


public abstract class Figure {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void printInfo() {
        System.out.println("Фигура: " + this.getClass().getSimpleName());
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println(" ");
    }
}
