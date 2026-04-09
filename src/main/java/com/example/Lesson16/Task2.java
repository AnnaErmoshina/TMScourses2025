package com.example.Lesson16;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String[] strings = {"code", "bug"};

        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            String firstChar = str.substring(0, 1);
            String lastChar = str.substring(str.length() - 1);
            result.put(firstChar, lastChar);
        }

        System.out.println(result);
    }
}
