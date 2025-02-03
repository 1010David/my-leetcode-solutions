package com.project.leetcode_solutions.easy.algorithms.middleOfLinkedList;



public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: Odd number of nodes (Example 1)
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode middleNode1 = solution.middleNode(head1);
        System.out.println("Example 1:");
        System.out.println("Input: head = [1, 2, 3, 4, 5]");
        System.out.println("Output: [3, 4, 5]"); // This line is adjusted
        System.out.println("Actual middle node value: " + middleNode1.val);

        // Test Case 2: Even number of nodes (Example 2)
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode middleNode2 = solution.middleNode(head2);
        System.out.println("\nExample 2:");
        System.out.println("Input: head = [1, 2, 3, 4, 5, 6]");
        System.out.println("Output: [4, 5, 6]"); // This line is adjusted
        System.out.println("Actual middle node value: " + middleNode2.val);
    }
}
