package com.techprimers.testing;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    public FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
    	fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testNumber() {
        String fizzBuz = fizzBuzz.play(1);
        assertEquals(fizzBuz, "1");
    }

    @Test
    public void testFizz() {
        String fizzBuz = fizzBuzz.play(3);
        assertEquals(fizzBuz, "Fizz");
    }

    @Test
    public void testBuzz() {
        String fizzBuz = fizzBuzz.play(5);
        assertEquals(fizzBuz, "Buzz");
    }

    @AfterEach
    public void tearDown() {
    	fizzBuzz = null;
    }

}