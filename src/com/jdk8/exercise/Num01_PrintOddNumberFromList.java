package com.jdk8.exercise;

import java.util.List;

public class Num01_PrintOddNumberFromList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printOddNumbersFromList(numbers);
    }

    private static void printOddNumbersFromList(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }
}
