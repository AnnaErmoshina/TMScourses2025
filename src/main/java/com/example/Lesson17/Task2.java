package com.example.Lesson17;
import java.util.Arrays;
import java.util.function.Predicate;

public class Task2 {
        public static void main(String[] args) {

            Integer[] numbers = {-5, 10, -3, 8, -1, 0, 15, -7, 4, -2};
            System.out.println("Исходный массив: " + Arrays.toString(numbers));

            Predicate<Integer> isPositive = n -> n > 0;

            System.out.println("Положительные числа:");

            for (Integer number : numbers) {
                if (isPositive.test(number)) {
                    System.out.print(number + " ");
                }
            }
        }
}

