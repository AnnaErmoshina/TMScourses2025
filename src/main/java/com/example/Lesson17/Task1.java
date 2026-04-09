package com.example.Lesson17;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату своего рождения в формате YYYY-ММ-DD:");
        String inputDate = scanner.nextLine();

            LocalDate birthDate = LocalDate.parse(inputDate);

            LocalDate hundredthBirthday = birthDate.plusYears(100);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            String formattedDate = hundredthBirthday.format(formatter);

            System.out.println("Вам исполнится 100 лет: " + formattedDate);
    }
}