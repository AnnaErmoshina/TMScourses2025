package com.example.Lesson8_Task1;

public class Dentist implements Doctor{
    @Override
    public void treat() {
        System.out.println("Провожу осмотр...");
        System.out.println("Осмотр проведен. Вам удалили все зубы.");
    }
}
