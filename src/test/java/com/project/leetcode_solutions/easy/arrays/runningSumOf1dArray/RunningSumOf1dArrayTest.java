package com.project.leetcode_solutions.easy.arrays.runningSumOf1dArray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RunningSumOf1dArrayTest {

    @Test
    void shouldCalculateRunningSumForExample1() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int[] expected = {2, 9, 20, 35};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    void shouldCalculateRunningSumForExample2() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 4};
        int[] expected = {3, 5, 9};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    void shouldCalculateRunningSumForExample3() {
        Solution solution = new Solution();
        int[] nums = {3, 3};
        int[] expected = {3, 6};
        assertArrayEquals(expected, solution.runningSum(nums));
    }
}
