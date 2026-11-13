# Merge k Sorted Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order.

 *Merge all the linked-lists into one sorted linked-list and return it.* 

 

 **Example 1:** 

```
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted linked list:
1->1->2->3->4->4->5->6

```

 **Example 2:** 

```
Input: lists = []
Output: []

```

 **Example 3:** 

```
Input: lists = [[]]
Output: []

```

 

 **Constraints:** 

- k == lists.length
- 0 <= k <= 104
- 0 <= lists[i].length <= 500
- -104 <= lists[i][j] <= 104
- lists[i] is sorted in ascending order.
- The sum of lists[i].length will not exceed 104.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.97%)  
**Memory:** 46.3 MB (beats 84.16%)  
**Submitted:** 2026-11-13T04:44:19.121Z  

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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
        return null;

        return dividelist(lists,0,lists.length-1);
    }
    private ListNode dividelist(ListNode[] lists,int left, int right)
    {
        if(left == right)
        return lists[left];
        
        int mid = (left+right)/2;
        ListNode l1=dividelist(lists,left,mid);
        ListNode l2=dividelist(lists,mid+1,right);
        return mergelist(l1,l2);
    }
    private ListNode mergelist(ListNode l1, ListNode l2)
    {
        ListNode temp = new ListNode(0);
        ListNode tail = temp;

        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                tail.next = l1;
                l1 = l1.next;
            }
            else
            {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if(l1 != null)
        tail.next = l1;
        else
        tail.next = l2;
        return temp.next;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/merge-k-sorted-lists/)