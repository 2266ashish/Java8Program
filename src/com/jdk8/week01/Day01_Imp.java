package com.jdk8.week01;

public class Day01_Imp {
    public static void main(String[] args) {


        int[] arr = {1, 1, 3, 6, 9, 10};

        int index = 0;

        // Step 1: move non-1 elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                arr[index++] = arr[i];
            }
        }

        // Step 2: fill remaining with 1
        while (index < arr.length) {
            arr[index++] = 1;
        }

        // print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
