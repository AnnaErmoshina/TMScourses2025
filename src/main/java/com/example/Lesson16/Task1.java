package com.example.Lesson16;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "d", "a", "a", "b", "b", "e", "e"};

        Map<String, Boolean> result = new HashMap<>();

        for (String word : strings) {
            result.put(word, result.containsKey(word));
        }
        System.out.println(result);
    }
}