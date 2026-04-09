package com.example.Lesson15;
import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        HashSet <String> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++){
            set.add(Character.toString(input.charAt(i)));
        }
        System.out.println("Результат: " + set.toString());
    }
}
