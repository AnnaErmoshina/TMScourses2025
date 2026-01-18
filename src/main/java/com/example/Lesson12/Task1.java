package com.example.Lesson12;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite stroku s abbreviaturami: ");
        String string = scanner.nextLine();

        Pattern pattern = Pattern.compile ("\\D\\S[A-Z]{1,5}");
        Matcher matcher = pattern.matcher (string);

        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();
            System.out.println("abbreviatura: " + string.substring(start,end));
        }
    }
}


