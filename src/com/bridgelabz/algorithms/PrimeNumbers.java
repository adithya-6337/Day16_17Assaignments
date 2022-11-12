package com.bridgelabz.algorithms;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter start value : ");
        int a = sc.nextInt();
        System.out.print("\nEnter end value : ");
        int b = sc.nextInt();
        System.out.print("\nPrime numbers between " + a + " and " + b + " are : ");
        while (a < b) {
            int flag = 0;

            for (int i = 2; i < a / 2; i++) {
                if (a % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.print(a + " ");
            a++;
        }
    }
}