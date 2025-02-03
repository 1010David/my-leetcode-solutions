package com.project.leetcode_solutions.easy.algorithms.ransomNote;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RansomNoteTest {

    @Test
    void testCanConstruct_Example1() {
        Solution solution = new Solution();
        String ransomNote = "a";
        String magazine = "b";
        assertFalse(solution.canConstruct(ransomNote, magazine));
    }

    @Test
    void testCanConstruct_Example2() {
        Solution solution = new Solution();
        String ransomNote = "aa";
        String magazine = "ab";
        assertFalse(solution.canConstruct(ransomNote, magazine));
    }

    @Test
    void testCanConstruct_Example3() {
        Solution solution = new Solution();
        String ransomNote = "aa";
        String magazine = "aab";
        assertTrue(solution.canConstruct(ransomNote, magazine));
    }
}
