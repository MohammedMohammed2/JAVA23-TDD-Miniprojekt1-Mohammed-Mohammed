package org.example;

import java.util.Scanner;

public class Main {

    static int previousPrimeNumber = 0;
    static int sumOfPrimeNums = 0;

    static int amountOfPimeNumbersWithInRange = 0;

    public static boolean isPrime(int num) {

        if (num < 0 || num > 1000){
            throw new IllegalArgumentException("Number must be non-negative or above 1000");}

        if (num <= 1){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static int addedPrimeNumbers(int a, int b) {
            int sum = 0;

            for (int i = a; i <= b; i++){
                if (isPrime(i)){
                    sum += i;
                }
            }
            return sum;
        }
    public static int countPrime(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++){
            if (isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public static void printSum() {
        System.out.println("the sum of all prime numbers is:" + addedPrimeNumbers(0,1000) );
    }
    public static void printCount() {
        System.out.println("the total of all prime numbers within the range of 0 to 1000:"+ countPrime(0,1000));
    }
    public static void main(String[] args) {
        printCount();
        printSum();

    }
}