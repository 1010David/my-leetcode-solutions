# Find Middle Node of Linked List

**Problem Description**

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

**Examples**

* **Example 1:**
    *   Input: `head = [1,2,3,4,5]`
    *   Output: `[3,4,5]`
    *   Explanation: The middle node of the list is node 3.

* **Example 2:**
    *   Input: `head = [1,2,3,4,5,6]`
    *   Output: `[4,5,6]`
    *   Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

**Constraints**

*   The number of nodes in the list is in the range [1, 100].
*   `1 <= Node.val <= 100`

**Solution Approach**

This solution employs the "fast and slow pointer" technique to efficiently find the middle node of the linked list.

1. **Initialization:** Two pointers, `slow` and `fast`, are initialized to the head of the linked list.

2. **Iteration:** The `while` loop iterates as long as `fast` and `fast.next` are not null.
    - In each iteration:
        - `slow` moves one node forward.
        - `fast` moves two nodes forward.

3. **Middle Node:** When the loop terminates, the `slow` pointer will be pointing to the middle node of the linked list.

**Time Complexity:** O(n), where n is the number of nodes in the linked list.

**Space Complexity:** O(1), as the algorithm uses only constant extra space for the `slow` and `fast` pointers.

**Code**

```java
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