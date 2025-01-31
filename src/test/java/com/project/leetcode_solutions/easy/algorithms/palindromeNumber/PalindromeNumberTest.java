package com.project.leetcode_solutions.easy.algorithms.palindromeNumber;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void testPositivePalindrome() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(121), "121 debería ser un palíndromo");
    }

    @Test
    void testNegativeNumber() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome(-121), "-121 no debería ser un palíndromo");
    }

    @Test
    void testNumberEndingInZero() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome(10), "10 no debería ser un palíndromo");
    }

    @Test
    void testSingleDigitNumbers() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(7), "Los números de un solo dígito siempre son palíndromos");
    }

    @Test
    void testLargePalindrome() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(12321), "12321 debería ser un palíndromo");
    }

    @Test
    void testLargeNonPalindrome() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome(123456), "123456 no debería ser un palíndromo");
    }
}
