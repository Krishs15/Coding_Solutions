# Sort Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a stack of integers  **st[]**. Sort the stack in ascending order (smallest element at the bottom and largest at the top).

 **Examples:** 

```
Input: st[] = [41, 3, 32, 2, 11]
Output: [41, 32, 11, 3, 2]
Explanation: After sorting, the smallest element (2) is at the bottom and the largest element (41) is at the top.

```

```
Input: st[] = [3, 2, 1]
Output: [3, 2, 1]
Explanation: The stack is already sorted in ascending order.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T04:27:01.203Z  

```java
class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st == null || st.isEmpty())
        return ;
        
        int top = st.pop();
        sortStack(st);
        Sorting(st, top);
    }
    
    private void Sorting(Stack<Integer> st, int element)
    {
        if(st.isEmpty() || st.peek() <= element)
        {
            st.push(element);
            return;
        }
        int large = st.pop();
        Sorting(st, element);
        st.push(large);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-a-stack/1)