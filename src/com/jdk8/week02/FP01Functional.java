package com.jdk8.week02;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        printAllNumbersInListFunctional(numbers);
//        printAllEvenNumbersInListFunctional(numbers);
        printSquaresOfEvenNumbersInListFunctional(numbers);


    }



//    public static void print(int num){
//        System.out.println(num);
//    }

    private static boolean isEven(int number){
        return number%2==0;
    }
    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
//                .forEach(FP01Functional::print);
                .forEach(System.out::println);

    }


    private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
//                .filter(FP01Functional::isEven)
                .filter(n->n%2==0)
                .forEach(System.out::println);

    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                .filter(n->n%2==0)
                .map(n->n*n)
                .forEach(System.out::println);
    }


}
