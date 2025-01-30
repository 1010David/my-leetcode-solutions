# Two Sum

## Problem Description

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you may not use the *same* element twice.

You can return the answer in any order.

## Examples

### Example 1

**Input:** `nums = [2,7,11,15], target = 9`
**Output:** `[0,1]`
**Explanation:** Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

### Example 2

**Input:** `nums = [3,2,4], target = 6`
**Output:** `[1,2]`

### Example 3

**Input:** `nums = [3,3], target = 6`
**Output:** `[0,1]`

## Constraints

*   `2 <= nums.length <= 10^4`
*   `-10^9 <= nums[i] <= 10^9`
*   `-10^9 <= target <= 10^9`
*   Only one valid answer exists.

## Solution Approach

To solve this problem, I used a hash table (HashMap) approach. This allows me to efficiently find the complement of each number in the array, with a time complexity of O(n).

## Code Explanation

1.  **HashMap Creation:** A HashMap is created to store each number from the `nums` array as a key and its corresponding index as a value.

2.  **Array Iteration:** The `nums` array is iterated over using a `for` loop.

3.  **Complement Calculation:** For each number `nums[i]`, the complement needed to reach the `target` is calculated: `complement = target - nums[i]`.

4.  **HashMap Lookup:** It's checked if the `complement` already exists as a key in the HashMap. If it does, it means that the two numbers that add up to `target` have been found.

5.  **Indices Return:** If the `complement` is found in the HashMap, an array is returned with the index of the `complement` (obtained from the HashMap) and the current index `i`.

6.  **Exception Handling:** If the loop finishes without finding a solution, an `IllegalArgumentException` is thrown indicating that no solution was found.

## Complexity

*   **Time:** O(n), where n is the length of the `nums` array.
*   **Space:** O(n), due to the use of the HashMap to store the numbers and their indices.

## Follow-up

The original problem in LeetCode proposes a "Follow-up" which consists of devising an algorithm with a time complexity lower than O(n^2). The implemented solution already meets this requirement, as it uses a HashMap to achieve a time complexity of O(n).

## Link to the problem on LeetCode

[Two Sum](https://leetcode.com/problems/two-sum/)