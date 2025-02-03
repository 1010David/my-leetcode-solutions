package com.project.leetcode_solutions.easy.algorithms.middleOfLinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleOfLinkedList {

    @Test
    void testMiddleNodeOddLength() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode middleNode = solution.middleNode(head);
        assertEquals(3, middleNode.val);
    }

    @Test
    void testMiddleNodeEvenLength() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode middleNode = solution.middleNode(head);
        assertEquals(4, middleNode.val);
    }
}
