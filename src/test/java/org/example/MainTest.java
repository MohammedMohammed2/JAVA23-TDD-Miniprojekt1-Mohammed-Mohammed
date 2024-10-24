package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main = new Main();

    @Test
    @DisplayName("given number is a prime number")
    public void testPrime() {
        assertTrue(main.isPrime(997), "this is  prime");
    }
    @Test
    public void testPrintSum() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        main.printSum();
        System.setOut(System.out);
        assertEquals("the sum of all prime numbers is:76127", outContent.toString().trim());
    }
    @Test
    public void testPrintCount() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        main.printCount();

        System.setOut(System.out);

        assertEquals("the total of all prime numbers within the range of 0 to 1000:168", outContent.toString().trim());
    }

    @Test
    @DisplayName("given number is not a prime number")
    public void notPrime() {
        assertFalse(main.isPrime(1), "this is not prime");
        assertFalse(main.isPrime(4), "this is not prime");
    }


    @Test
    public void testIsPrimeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> main.isPrime(-5));
    }

    @Test
    @DisplayName("checking sum within range")
    public void testPrimeSumWithinRange() {
        assertEquals(17, main.addedPrimeNumbers(0,10));
        assertEquals(77,main.addedPrimeNumbers(0,20));
    }

    @Test
    @DisplayName("checking count within range")
    public void testPrimeCountWithInRange(){
        assertEquals(4,main.countPrime(0,10));
    }
}