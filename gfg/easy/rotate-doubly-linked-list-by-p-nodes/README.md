# Rotate Doubly Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a doubly linked list, rotate the linked list counter-clockwise by k nodes. Here k is a given positive integer and its value is smaller or equal than the size of linked list.

 **Examples :** 

```
Input: head = [1, 2, 3, 4, 5, 6] k = 2
Output: 3 <-> 4 <-> 5 <-> 6 <-> 1 <-> 2
Explanation: Doubly linked list after rotating
2 nodes is: 3 4 5 6 1 2.
```

```
Input: head = [3, 4, 5, 1], k = 3
Output: 1 <-> 3 <-> 4 <-> 5

```

```
Input: head = [1, 2, 3], k = 2
Output: 3 <-> 1 <-> 2
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T10:24:29.377Z  

```java
/* Structure of a doubly link list node
class Node {
    int data;
    Node prev, next;
    Node(int x) {
        data = x;
        prev = null;
        next = null;
    }
}*/

class Solution {
    public Node rotateDLL(Node head, int k) {
        // code here
        Node curr = head;
        Node prev = null;
        
        if(head == null || head.next == null)
        return head;
        
        while(curr.next!=null)
        curr = curr.next;
        
        curr.next = head;
        curr = head;
        
        for(int i=1;i<=k;i++)
        {
            prev = curr;
            curr = curr.next;
        }
        
        prev.next = null;
        curr.prev = null;
        head = curr;
        
        return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rotate-doubly-linked-list-by-p-nodes/1)