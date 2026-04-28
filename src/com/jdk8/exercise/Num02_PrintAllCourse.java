package com.jdk8.exercise;

import java.util.List;

public class Num02_PrintAllCourse {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
//        printAllCourse(courses);
//        Print Courses Containing the word "Spring"
//        printCourseContainingSpring(courses);
          printCourseCharInEachCourse(courses);
    }



    private static void printAllCourse(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

    private static void printCourseContainingSpring(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCourseCharInEachCourse(List<String> courses) {
        courses.stream()
                .map(s->s + ": length -> "+s.length())
                .forEach(System.out::println);
    }
}
