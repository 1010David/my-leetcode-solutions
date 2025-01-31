# Palindrome Number

## Problem Description

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A **palindrome** is a number that reads the same forward and backward.

## Examples

### Example 1

**Input:** `x = 121`
**Output:** `true`
**Explanation:** 121 reads as 121 from left to right and from right to left.

### Example 2

**Input:** `x = -121`
**Output:** `false`
**Explanation:** From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.

### Example 3

**Input:** `x = 10`
**Output:** `false`
**Explanation:** Reads 01 from right to left. Therefore, it is not a palindrome.

## Constraints

* `-2^{31} <= x <= 2^{31} - 1`

## Solution Approach

To solve this problem, we avoid converting the integer to a string and instead use mathematical operations.

1. **Edge Cases:**
    - If `x` is negative, return `false` because negative numbers are not palindromes.
    - If `x` ends in 0 but is not 0 itself, return `false` (e.g., `10` is not a palindrome).

2. **Reversing the Number:**
    - Extract the last digit using `x % 10`.
    - Build the reversed number by multiplying the previous result by 10 and adding the extracted digit.
    - Continue until half of the number is processed.

3. **Comparison:**
    - Compare the original number (or its first half) with the reversed second half.

## Code Implementation (Java)

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversed = 0;
        int original = x;
        
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        
        return original == reversed;
    }
}
```

## Complexity Analysis

* **Time Complexity:** `O(log(x))` – The number of digits in `x` determines the number of iterations.
* **Space Complexity:** `O(1)` – No extra space is used apart from variables.

## Follow-up

Can you solve this problem **without** reversing the entire number? One way is to compare only half of the digits by reversing half of `x` and checking if it matches the first half.

## Link to the problem on LeetCode

[Palindrome Number](https://leetcode.com/problems/palindrome-number/)

