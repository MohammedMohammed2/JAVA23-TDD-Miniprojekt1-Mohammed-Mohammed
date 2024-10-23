package org.example;

import java.util.Scanner;

public class Main {

    static int previousPrimeNumber = 0;
    static int sumOfPrimeNums = 0;

    static int amountOfPimeNumbersWithInRange = 0;

    public static boolean isPrime(int num) {
        int count = 0;
        if (num < 2)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }


        return true;
    }

    public static int addedPrimeNumbers(int a, int b) {

        return a + b;

    }

    public static void printSum(int sumOfPrimeNums) {
        System.out.println("the sum of all prime numbers is:" + " " + sumOfPrimeNums + " " + "Prime numbers sum");
    }

    public static void printCount(int amountOfPimeNumbersWithInRange) {
        System.out.println("the total of all prime numbers with in the range of 0 to 1000:" + " " + amountOfPimeNumbersWithInRange + " " + "prime numbers");
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {

            if (isPrime(i)) {
                System.out.println(i);
                sumOfPrimeNums = addedPrimeNumbers(i, previousPrimeNumber);
                previousPrimeNumber = i;
                amountOfPimeNumbersWithInRange++;
            }
        }
        printSum(sumOfPrimeNums);
        printCount(amountOfPimeNumbersWithInRange);
    }
}