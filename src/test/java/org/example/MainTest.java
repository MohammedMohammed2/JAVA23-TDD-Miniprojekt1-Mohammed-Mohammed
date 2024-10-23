package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main = new Main();

    @Test
    @DisplayName("given number is a prime number")
    public void testPrime() {
        assertTrue(main.isPrime(997), "this is  prime");

    }

    @Test
    @DisplayName("given number is not a prime number")
    public void notPrime() {
        assertFalse(main.isPrime(1), "this is not prime");
        assertFalse(main.isPrime(4), "this is not prime");
    }

    @Test
    @DisplayName("special cases")
    public void testEdgeCases() {
        assertFalse(main.isPrime(0), "0 is not a prime number");
        assertFalse(main.isPrime(-1), " negative number arent prime numbers either");
    }


    @Test
    public void testAddPrimeNumbers() {
        assertEquals(5, main.addedPrimeNumbers(3, 2));
    }


    @Test
    @DisplayName("range tester and total prime checker")
    public void testPrimeSumWithinRange() {
        int sumOfPrimes = 0;
        int primeCount = 0;

        for (int i = 1; i <= 10; i++) {
            if (main.isPrime(i)) {
                sumOfPrimes = main.addedPrimeNumbers(i, sumOfPrimes);
                primeCount++;
            }
        }

        assertEquals(17, sumOfPrimes);
        assertEquals(4, primeCount);
    }
}