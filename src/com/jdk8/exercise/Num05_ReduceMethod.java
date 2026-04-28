package com.jdk8.exercise;

import java.util.Comparator;
import java.util.List;

public class Num05_ReduceMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        int sum = sumUsingReduce(numbers);
        System.out.println(sum);
    }

    private static int sumUsingReduce(List<Integer> numbers) {
         /*return numbers.stream()
                 .mapToInt(n->n)
                 .sum();*/

        return numbers.stream()
                .reduce(0,(a,b)->a+b);

    }
}
