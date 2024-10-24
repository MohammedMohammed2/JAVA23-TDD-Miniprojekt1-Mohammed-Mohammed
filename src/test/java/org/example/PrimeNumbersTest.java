package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    PrimeNumbers primeNumbers = new PrimeNumbers();

    @Test
    @DisplayName("given number is a prime number")
    public void testPrime() {
        assertTrue(primeNumbers.isPrime(997), "this is  prime");
    }
    @Test
    @DisplayName("test if the system out print is correct for the total amount of prime numbers")
    public void testPrintSum() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        primeNumbers.printSum();
        System.setOut(System.out);
        assertEquals("the sum of all prime numbers is:76127", outContent.toString().trim());
    }
    @Test
    @DisplayName("test if the system out print is correct for the total of prime numbers")
    public void testPrintCount() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        primeNumbers.printCount();

        System.setOut(System.out);

        assertEquals("the total of all prime numbers within the range of 0 to 1000:168", outContent.toString().trim());
    }

    @Test
    @DisplayName("given number is not a prime number")
    public void notPrime() {
        assertFalse(primeNumbers.isPrime(1), "this is not prime");
        assertFalse(primeNumbers.isPrime(4), "this is not prime");
    }


    @Test
    @DisplayName("throws exception in case its lower than 0 or higher than a 1000")
    public void testIsPrimeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> primeNumbers.isPrime(-5));
        assertThrows(IllegalArgumentException.class, () -> primeNumbers.isPrime(1200));
    }

    @Test
    @DisplayName("checking sum within range")
    public void testPrimeSumWithinRange() {
        assertEquals(17, primeNumbers.addedPrimeNumbers(0,10));
        assertEquals(77, primeNumbers.addedPrimeNumbers(0,20));
    }

    @Test
    @DisplayName("checking count within range")
    public void testPrimeCountWithInRange(){
        assertEquals(4, primeNumbers.countPrime(0,10));
    }
}