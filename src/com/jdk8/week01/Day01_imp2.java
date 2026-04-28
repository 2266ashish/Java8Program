package com.jdk8.week01;

public class Day01_imp2 {
    public static boolean isOneEditAway(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Step 1: length check
        if (Math.abs(m - n) > 1) return false;

        // Identify shorter & longer string
        String shorter = m < n ? s1 : s2;
        String longer  = m < n ? s2 : s1;

        int i = 0, j = 0;
        boolean foundDifference = false;

        while (i < shorter.length() && j < longer.length()) {

            if (shorter.charAt(i) != longer.charAt(j)) {

                if (foundDifference) return false;

                foundDifference = true;

                if (m == n) {
                    i++; // replace case
                }
            } else {
                i++; // move both if same
            }
            j++; // always move longer pointer
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isOneEditAway("PALE", "BALE")); // true
    }
}
