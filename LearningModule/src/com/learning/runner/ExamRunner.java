package com.learning.runner;

import java.util.*;

public class ExamRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" please enter the decimal number:-");
        int x = sc.nextInt();

        if (isPrime(x)) {

            System.out.println("this is a prime number.");
        } else {
            System.out.println("this is not a prime number.");
        }
    }

    public static boolean isPrime(int n) {

        if (n == 0 || n == 1) {
            return false;

        }
        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}






