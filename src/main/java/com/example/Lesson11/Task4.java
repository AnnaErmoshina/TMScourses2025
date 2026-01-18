package com.example.Lesson11;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки (слова):");
        String[] words = new String[3];
        for (int i = 0; i < 3; i++) {
            words[i] = scanner.nextLine();
        }

        String result = null;

        for (int wordIndex = 0; wordIndex < words.length; wordIndex++) {
            String currentWord = words[wordIndex];
            boolean allCharsUnique = true;

            for (int i = 0; i < currentWord.length(); i++) {
                char currentChar = currentWord.charAt(i);

                for (int j = i + 1; j < currentWord.length(); j++) {
                    if (currentWord.charAt(j) == currentChar) {
                        allCharsUnique = false;
                        break;
                    }
                }
                if (!allCharsUnique) {
                    break;
                }
            }

            if (allCharsUnique) {
                result = currentWord;
                break;
            }
        }

        if (result != null) {
            System.out.println("\nНайдено слово: \"" + result + "\"");
        } else {
            System.out.println("\nПодходящих слов не найдено.");
        }
    }
}