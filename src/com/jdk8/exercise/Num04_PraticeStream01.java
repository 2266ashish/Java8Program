package com.jdk8.exercise;

import java.util.List;

public class Num04_PraticeStream01 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        /*List<Integer> result = IntStream.range(0, numbers.size())
                .filter(i -> i == 1 || i == 2)
                .mapToObj(numbers::get)
                .toList();*/

        List<Integer> result = numbers.stream()
                .skip(1)
                .limit(3)
                .toList();

        System.out.println(result);
    }
}
