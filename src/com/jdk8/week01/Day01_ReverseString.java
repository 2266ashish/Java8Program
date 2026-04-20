package com.jdk8.week01;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day01_ReverseString {
    public static void main(String[] args) {
        String str = "RAM";
        reverseStringUsingStream(str);
//        reverseString(str);
    }

    private static void reverseStringUsingStream(String str) {
        String reverse = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - 1 - i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(reverse);
    }
//best approche
    private static void reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();
        System.out.println(reverse);
    }
}
