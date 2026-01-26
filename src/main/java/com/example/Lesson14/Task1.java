package com.example.Lesson14;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Task1 {
    public static void main(String[] args) {

        File dir1 = new File("C:\\Users\\Anna\\Desktop");
        File output = new File(dir1, "output.txt");
        File input = new File(dir1, "input.txt");

        String maxWord = "";
        String tempWord = "";

        try (FileReader fr = new FileReader("C:\\Users\\Anna\\Desktop\\output.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                char ch = (char) i;
                System.out.print(ch);

                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    tempWord += ch;
                } else {
                    if (tempWord.length() > maxWord.length()) {
                        maxWord = tempWord;
                    }
                    tempWord = "";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Проверяем последнее слово
        if (tempWord.length() > maxWord.length()) {
            maxWord = tempWord;
        }

        try (FileWriter fw = new FileWriter("C:\\Users\\Anna\\Desktop\\input.txt")) {
            fw.write(maxWord);
            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\nСамое длинное слово: " + maxWord);
    }
}