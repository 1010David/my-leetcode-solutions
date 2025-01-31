package com.project.leetcode_solutions.easy.arrays.twoSum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void shouldFindIndicesForExample1() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void shouldFindIndicesForExample2() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
    @Test
    public void shouldHandleEmptyArray() {
        Solution solution = new Solution();
        int[] nums = {};
        int target = 9;
        assertThrows(IllegalArgumentException.class, () -> solution.twoSum(nums, target));
    }

    @Test
    public void shouldHandleSingleElement() {
        Solution solution = new Solution();
        int[] nums = {2};
        int target = 4;
        assertThrows(IllegalArgumentException.class, () -> solution.twoSum(nums, target));
    }

    @Test
    public void shouldHandleMultipleSolutions() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15, 2};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        assertTrue(Arrays.equals(result, new int[]{0, 1}) || Arrays.equals(result, new int[]{0, 4}));
    }

    @Test
    public void shouldHandleNegativeNumbers() {
        // ... (tu prueba existente)
    }

    @Test
    public void shouldHandleLargeNumbers() {
        Solution solution = new Solution();
        int[] nums = {Integer.MAX_VALUE - 1, 1};
        int target = Integer.MAX_VALUE;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    public void shouldHandleRepeatedNumbers() {
        Solution solution = new Solution();
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}