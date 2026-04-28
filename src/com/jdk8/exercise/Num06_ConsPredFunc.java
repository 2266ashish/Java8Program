package com.jdk8.exercise;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Num06_ConsPredFunc {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        squareOddNum(numbers);
    }

    private static void squareOddNum(List<Integer> numbers) {
        System.out.println("hello");
        Predicate<Integer> evenPredicate = num -> num % 2 == 0;

        Predicate<Integer> integerPredicate1 = new Predicate<Integer>() {

            @Override
            public boolean test(Integer x) {
                return x%2==0;
            }
        };

        Function<Integer, Integer> squareFunction = num -> num * num;
        Consumer<Integer> printConsumer = System.out::println;

        numbers.stream()
                .filter(integerPredicate1)
                .map(squareFunction)
                .forEach(printConsumer);
    }
}
