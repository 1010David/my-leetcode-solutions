package com.project.leetcode_solutions.easy.algorithms.middleOfLinkedList;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 *p
 * If there are two middle nodes, return the second middle node.
 *p
 * Example 1:
 *p
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 * Example 2:
 *p
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 *p
 * Constraints:
 *p
 * The number of nodes in the list is in the range [1, 100].
 * 1 <= Node.val <= 100
 */


class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
