# Partition List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a linked list and a value `x`, partition it such that all nodes  **less than**  `x` come before nodes  **greater than or equal**  to `x`.

You should  **preserve**  the original relative order of the nodes in each of the two partitions.

 

 **Example 1:** 

```
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]

```

 **Example 2:** 

```
Input: head = [2,1], x = 2
Output: [1,2]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 200].
- -100 <= Node.val <= 100
- -200 <= x <= 200

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.5 MB (beats 80.94%)  
**Submitted:** 2026-10-28T11:16:11.213Z  

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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode great = new ListNode(0);
        ListNode s = small;
        ListNode g = great;
        ListNode curr = head;

        while(curr != null)
        {
            if(curr.val < x)
            {
                s.next = curr;
                s = s.next;
            }
            else
            {
                g.next = curr;
                g = g.next;
            }
            curr = curr.next;
        }

        g.next = null;
        s.next = great.next;

        return small.next;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/partition-list/)