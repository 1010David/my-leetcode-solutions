package com.project.leetcode_solutions.easy.algorithms.stepsToReduceNumber;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SteepsToReduceNumberTest {

    @Test
    void testNumberOfStepsExample1() {
        Solution solution = new Solution();
        int num = 14;
        int expectedSteps = 6;
        assertEquals(expectedSteps, solution.numberOfSteps(num));
    }

    @Test
    void testNumberOfStepsExample2() {
        Solution solution = new Solution();
        int num = 8;
        int expectedSteps = 4;
        assertEquals(expectedSteps, solution.numberOfSteps(num));
    }

    @Test
    void testNumberOfStepsExample3() {
        Solution solution = new Solution();
        int num = 123;
        int expectedSteps = 12;
        assertEquals(expectedSteps, solution.numberOfSteps(num));
    }

}
