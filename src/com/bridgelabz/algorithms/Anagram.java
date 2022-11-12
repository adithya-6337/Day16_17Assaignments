package com.bridgelabz.algorithms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String x,y;
         x = "is a java programming";
         y = "java is a programming";

        char[] a = x.toCharArray();
        char[] b = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result = Arrays.equals(a,b);
        if(result){
            System.out.println("Strings are Anagram");
        }else {
            System.out.println("Strings are not Anagram");
        }
    }
}
