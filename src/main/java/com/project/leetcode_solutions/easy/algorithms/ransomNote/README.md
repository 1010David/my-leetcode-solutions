# Ransom Note

**Problem Description**

Given two strings, `ransomNote` and `magazine`, determine if `ransomNote` can be constructed by using the letters from `magazine` exactly once for each letter.

**Examples**

* **Example 1:**
    *   Input: `ransomNote = "a", magazine = "b"`
    *   Output: `false`

* **Example 2:**
    *   Input: `ransomNote = "aa", magazine = "ab"`
    *   Output: `false`

* **Example 3:**
    *   Input: `ransomNote = "aa", magazine = "aab"`
    *   Output: `true`

**Constraints**

*   `1 <= ransomNote.length, magazine.length <= 10^5`
*   `ransomNote` and `magazine` consist of lowercase English letters.

**Solution Approach**

This solution utilizes a frequency array (`charCount`) to efficiently track the occurrence of each letter in the `magazine` string.

1. **Frequency Counting:**
    - An array `charCount` of size 26 is created to store the frequency of each lowercase letter in the `magazine` string.
    - The code iterates through each character in `magazine` and increments the count of the corresponding character in the `charCount` array.

2. **Ransom Note Verification:**
    - The code iterates through each character in `ransomNote`.
    - For each character, it decrements the count of that character in the `charCount` array.
    - If the count of a character in `charCount` becomes negative, it means `ransomNote` requires more occurrences of that letter than are available in `magazine`. In this case, the function returns `false`.

3. **Return True:**
    - If the loop completes without encountering any negative counts, it means all characters in `ransomNote` can be constructed using the letters from `magazine`, and the function returns `true`.

**Time Complexity:** O(n + m), where n is the length of `ransomNote` and m is the length of `magazine`.

**Space Complexity:** O(1), as the space used by the `charCount` array is constant (26 characters).

This approach provides an efficient solution to the Ransom Note problem.