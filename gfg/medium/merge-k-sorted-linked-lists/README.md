# Merge K Sorted Linked Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]** of n sorted linked lists of different sizes. Your task is to merge all these lists into a single sorted linked list and return the head of the merged list.

 **Examples:** 

```
Input:
   
Output: 1 -> 2 -> 3 -> 4 -> 7 -> 8 -> 9
Explanation: The arr[] has 3 sorted linked list of size 3, 3, 1.
1st list: 1 -> 3 -> 7
2nd list: 2 -> 4 -> 8
3rd list: 9
The merged list will be: 
    
```

```
Input:
   
Output: 1 -> 3 -> 4 -> 5 -> 6 -> 8
Explanation: The arr[] has 3 sorted linked list of size 2, 1, 3.
1st list: 1 -> 3
2nd list: 8
3rd list: 4 -> 5 -> 6
The merged list will be: 
    
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T04:26:46.309Z  

```java
/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node mergeKLists(Node[] arr) {
        if (arr == null || arr.length == 0) 
        return null;
        return mergeKLists(arr, 0, arr.length - 1);
    }

    private Node mergeKLists(Node[] arr, int left, int right) 
    {
        if (left == right) 
        return arr[left];

        int mid = left + (right - left) / 2;
        Node leftList = mergeKLists(arr, left, mid);
        Node rightList = mergeKLists(arr, mid + 1, right);

        return mergeTwoLists(leftList, rightList);
    }

    private Node mergeTwoLists(Node l1, Node l2) 
    {
        Node temp = new Node(0);
        Node tail = temp;

        while (l1 != null && l2 != null) 
        {
            if (l1.data <= l2.data) 
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

        tail.next = (l1 != null) ? l1 : l2;
        return temp.next;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1)