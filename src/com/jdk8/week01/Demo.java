package com.jdk8.week01;

public class Demo {
    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "ale";
        // One of the three operation Insert, delete, update
        boolean result = isOneStringEdit(str1,str2);
        System.out.println(result);
    }

    private static boolean isOneStringEdit(String str1, String str2) {
        int m = str1.length();
        int n=str2.length();
        //check length
        if(Math.abs(m-n)>1){
            return false;
        }

        String smaller=m<n?str1:str2;
        String longer=m<n?str2:str1;

        int i=0;
        int j=0;
        boolean foundIt = false;
        while(i<smaller.length() && j<longer.length()){
            if(smaller.charAt(i)!=longer.charAt(j)){
                if(foundIt) return false;
                    foundIt = true;
                    if (m == n) {
                        i++;
                    }
            }else{
                i++;
            }
                j++;
        }
        return true;
    }


}
