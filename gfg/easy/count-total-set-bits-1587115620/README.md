# Count Set Bits in 1 to n

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number **n**. Return the total count of set bits for all numbers from 1 to n (both inclusive).

**Examples :
**

```
Input: n = 4
Output: 5
Explanation: For numbers from 1 to 4. for 1: 0 0 1 => 1 set bit, for 2: 0 1 0 => 1 set bit, for 3: 0 1 1 => 2 set bits, for 4: 1 0 0 => 1 set bit. Therefore, the total set bits are 5.

```

```
Input: n = 17
Output: 35
Explanation: From numbers 1 to 17(both inclusive), the total number of set bits are 35.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T10:08:33.958Z  

```java
class Solution {
    public static int countSetBits(int n) {
        // code here
        n += 1; 
        int count = 0;
        int i = 0;
        
        while ((1 << i) <= n) 
        {
            int G = n / (1 << (i + 1));
            count += G * (1 << i);
            
            int r = n % (1 << (i + 1));
            count += Math.max(0, r - (1 << i));
            
            i++;
        }
        
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-total-set-bits-1587115620/1)