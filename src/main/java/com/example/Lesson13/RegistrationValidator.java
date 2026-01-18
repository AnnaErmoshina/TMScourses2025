package com.example.Lesson13;

public class RegistrationValidator {

    public static boolean validate(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        System.out.println("\nЛогин: " + login);
        System.out.println("Пароль: " + password);
        System.out.println("Подтверждение: " + confirmPassword);

        System.out.println("1. Проверка логина:");
        validateLogin(login);

        System.out.println("2. Проверка пароля:");
        validatePassword(password, confirmPassword);

        System.out.println("Все проверки пройдены успешно");
        return true;
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (login == null) {
            throw new WrongLoginException("Логин не может быть null");
        }

        if (login.length() >= 20) {
            throw new WrongLoginException("Логин должен быть меньше 20 символов. " + "Текущая длина: " + login.length());
        }

        if (login.contains(" ")) {
            throw new WrongLoginException("Логин не должен содержать пробелы");
        }

        System.out.println("Логин \"" + login + "\" корректен");
        System.out.println("Длина: " + login.length() + " символов");
    }

    private static void validatePassword(String password, String confirmPassword)
            throws WrongPasswordException {

        if (password == null) {
            throw new WrongPasswordException("Пароль не может быть null");
        }

        if (password.length() >= 20) {
            throw new WrongPasswordException("Пароль должен быть меньше 20 символов. " + "Текущая длина: " + password.length());
        }

        if (password.contains(" ")) {
            throw new WrongPasswordException("Пароль не должен содержать пробелы");
        }

        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
                break;
            }
        }

        if (!hasDigit) {
            throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение не совпадают");
        }

        System.out.println("Пароль корректен");
        System.out.println("Длина: " + password.length() + " символов");
        System.out.println("Содержит цифру: ДА");
        System.out.println("Совпадение с подтверждением: ДА");
    }
}
