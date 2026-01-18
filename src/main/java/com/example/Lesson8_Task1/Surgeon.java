package com.example.Lesson8_Task1;

public class Surgeon implements Doctor{
    @Override
    public void treat() {
        System.out.println("Провожу операцию... Чик-Чик");
        System.out.println("операция проведена. Вам все отрезали");
    }
}
