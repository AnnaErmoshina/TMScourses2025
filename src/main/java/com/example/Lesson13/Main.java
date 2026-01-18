package com.example.Lesson13;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Тест 1: " +
                    RegistrationValidator.validate("user123", "pass123", "pass123"));
        } catch (Exception e) {
            System.out.println("Тест 1: " + e.getMessage());
        }

        //Логин с пробелом
        try {
            System.out.println("Тест 2: " +
                    RegistrationValidator.validate("user name", "pass123", "pass123"));
        } catch (Exception e) {
            System.out.println("Тест 2: " + e.getMessage());
        }

        //Пароль без цифры
        try {
            System.out.println("Тест 3: " +
                    RegistrationValidator.validate("user", "password", "password"));
        } catch (Exception e) {
            System.out.println("Тест 3: " + e.getMessage());
        }

        //Пароли не совпадают
        try {
            System.out.println("Тест 4: " +
                    RegistrationValidator.validate("user", "pass123", "pass456"));
        } catch (Exception e) {
            System.out.println("Тест 4: " + e.getMessage());
        }
    }
}
