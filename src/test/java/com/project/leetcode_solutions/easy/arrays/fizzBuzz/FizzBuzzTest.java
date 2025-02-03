package com.project.leetcode_solutions.easy.arrays.fizzBuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void shouldReturnFizzBuzzForDivisibleBy3And5() {
        Solution solution = new Solution();
        int n = 15;
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expected, solution.fizzBuzz(n));
    }

    @Test
    void shouldReturnFizzForDivisibleBy3() {
        Solution solution = new Solution();
        int n = 3;
        List<String> expected = List.of("1", "2", "Fizz");
        assertEquals(expected, solution.fizzBuzz(n));
    }

    @Test
    void shouldReturnBuzzForDivisibleBy5() {
        Solution solution = new Solution();
        int n = 5;
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        assertEquals(expected, solution.fizzBuzz(n));
    }
}
