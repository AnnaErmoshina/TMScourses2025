package com.example.Lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>(Arrays.asList(
                    1, 2, 3, 4, 5, 2, 6, 3, 7, 8, 9, 4, 10, 5, 6
            ));

            System.out.println("Исходная коллекция: " + numbers);

            Integer sum = numbers.stream()
                    .distinct()
                    .filter(n -> n % 2 == 0)
                    .mapToInt(Integer::intValue)
                    .sum();

            System.out.println("Сумма четных уникальных элементов: " + sum);

            List<Integer> uniqueEvens = numbers.stream()
                    .distinct()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());

            System.out.println("Уникальные четные элементы: " + uniqueEvens);
        }
}

