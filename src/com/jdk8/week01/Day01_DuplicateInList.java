package com.jdk8.week01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day01_DuplicateInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,4,1);
        duplicateInList(list);
    }

    private static void duplicateInList(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();

        list.stream()
                .filter(n -> !seen.add(n))
                .forEach(System.out::println);

    }
}
