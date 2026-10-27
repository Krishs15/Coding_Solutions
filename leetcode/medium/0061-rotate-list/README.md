# Rotate List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a linked list, rotate the list to the right by `k` places.

 

 **Example 1:** 

```
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

```

 **Example 2:** 

```
Input: head = [0,1,2], k = 4
Output: [2,0,1]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 500].
- -100 <= Node.val <= 100
- 0 <= k <= 2 * 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.7 MB (beats 96.12%)  
**Submitted:** 2026-10-27T10:39:13.197Z  

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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        
        k = k % len;
        if (k == 0) {
            return head;
        }
        
        ListNode newtail = head;
        for (int i = 0; i < len - k - 1; i++) {
            newtail = newtail.next;
        }
        
        ListNode newhead = newtail.next;
        tail.next = head;
        newtail.next = null;
        
        return newhead;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/rotate-list/)