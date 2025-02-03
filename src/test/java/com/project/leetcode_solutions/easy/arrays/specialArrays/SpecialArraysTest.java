package com.project.leetcode_solutions.easy.arrays.specialArrays;


import com.project.leetcode_solutions.easy.arrays.twoSum.Solution;
import org.junit.jupiter.api.Test;


class SpecialArraysTest {

    @Test
    void shouldReturnTrueForSingleElementArray() {
        Solution solution = new Solution();
        int[] nums = {1};
    }

    @Test
    void shouldReturnTrueForAlternatingParity() {
        Solution solution = new Solution();
        int[] nums = {2, 1, 4};
    }

    @Test
    void shouldReturnFalseForConsecutiveOdds() {
        Solution solution = new Solution();
        int[] nums = {4, 3, 1, 6};
    }

    @Test
    void shouldReturnTrueForArrayWithAllEvenNumbers() {
        Solution solution = new Solution();
        int[] nums = {2, 4, 6, 8};
    }

    @Test
    void shouldReturnTrueForArrayWithAllOddNumbers() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 7};
    }
}


