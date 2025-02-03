package com.project.leetcode_solutions.easy.algorithms.ransomNote;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println("Test Case 1: " + solution.canConstruct(ransomNote1, magazine1)); // Expected: false

        // Test Case 2
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println("Test Case 2: " + solution.canConstruct(ransomNote2, magazine2)); // Expected: false

        // Test Case 3
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println("Test Case 3: " + solution.canConstruct(ransomNote3, magazine3)); // Expected: true

        // Add more test cases here for further validation
    }
}
