package com.jdk8.exercise;

import java.util.List;

public class Num03_PracticeStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        System.out.println(squareAndSum(numbers));
//        System.out.println(sumOfOddNumberFromList(numbers));
        createListOfEvenNum(numbers);
    }


    private static int squareAndSum(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(num -> num*num)
                .sum();
    }

    private static int sumOfOddNumberFromList(List<Integer> numbers) {
        return numbers.stream()
                .filter(num->num%2!=0)
//                .mapToInt(n->n)//using lambda
                .mapToInt(Integer::intValue)
                .sum();
    }


    private static void createListOfEvenNum(List<Integer> numbers) {
        List<Integer> listOfEven = numbers.stream()
                                        .filter(n->n%2==0)
                                        .toList();
        System.out.println(listOfEven);

    }
}
