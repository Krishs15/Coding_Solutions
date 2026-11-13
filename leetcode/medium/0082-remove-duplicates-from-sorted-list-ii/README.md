# Remove Duplicates from Sorted List II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the `head` of a  **sorted**  linked list.

Delete all nodes that have  **duplicate**  numbers, leaving only  **distinct**  numbers from the original list.

Return the linked list  **sorted**  as well.

 

 **Example 1:** 

```
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

```

 **Example 2:** 

```
Input: head = [1,1,1,2,3]
Output: [2,3]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 300].
- -100 <= Node.val <= 100
- The list is guaranteed to be sorted in ascending order.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 36.44%)  
**Memory:** 44.7 MB (beats 63.91%)  
**Submitted:** 2026-11-13T04:00:07.168Z  

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode temp = new ListNode(0, head);
        ListNode prev = temp;
        ListNode curr = head;

        while (curr != null) 
        {
            if (curr.next!=null && curr.val == curr.next.val) 
            {
                while (curr.next!=null && curr.val == curr.next.val) 
                {
                    curr = curr.next;
                }
                prev.next = curr.next;
            } 
            else 
            {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return temp.next;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)