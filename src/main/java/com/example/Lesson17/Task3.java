package com.example.Lesson17;

import java.util.function.Function;

public class Task3 {
        public static void main(String[] args) {

            double usdRate = 3.2;

            Function<String, Double> convertToUsd = (input) -> {
                String[] parts = input.trim().split(" ");

                try {
                    double amountByn = Double.parseDouble(parts[0]);
                    return amountByn / usdRate;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Неверный формат числа: " + parts[0]);
                }
            };

            testConversion(convertToUsd, "100 BYN");
            testConversion(convertToUsd, "250.50 BYN");
            testConversion(convertToUsd, "1000 BYN");
            testConversion(convertToUsd, "45.75 BYN");
        }

        private static void testConversion(Function<String, Double> converter, String input) {
            try {
                Double result = converter.apply(input);
                System.out.printf("%s = %.2f USD%n", input, result);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка для '" + input + "': " + e.getMessage());
            }
        }
}