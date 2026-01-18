package com.example.Lesson7_Task2;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        figures[0] = new Triangle( 3, 4, 5);
        figures[1] = new Rectangle(5, 10);
        figures[2] = new Circle(7);
        figures[3] = new Rectangle(4, 4);
        figures[4] = new Triangle(6, 8, 10);

        for (int i = 0; i < figures.length; i++) {
            System.out.println("Фигура №" + (i + 1) + ":");
            figures[i].printInfo();
        }

        double totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += figure.calculatePerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}
