package com.project.leetcode_solutions.easy.algorithms.ransomNote;


/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *p
 * Each letter in magazine can only be used once in ransomNote.
 *p
 * Example 1:
 *p
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *p
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *p
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 *p
 * Constraints:
 *p
 * 1 <= ransomNote. length, magazine.length <= 105
 * ransomNote and magazine consist of lowercase English letters.
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26]; // Arreglo para contar la frecuencia de cada letra en magazine

        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++; // Incrementa el contador de la letra correspondiente
        }

        for (char c : ransomNote.toCharArray()) {
            if (--charCount[c - 'a'] < 0) {
                return false; // Si la frecuencia de una letra en ransomNote es mayor que en magazine, retorna false
            }
        }

        return true;
    }
}
