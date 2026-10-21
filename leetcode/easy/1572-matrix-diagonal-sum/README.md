# Matrix Diagonal Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a square matrix `mat`, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

 

 **Example 1:** 

```
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

```

 **Example 2:** 

```
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

```

 **Example 3:** 

```
Input: mat = [[5]]
Output: 5

```

 

 **Constraints:** 

- n == mat.length == mat[i].length
- 1 <= n <= 100
- 1 <= mat[i][j] <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 45.9 MB (beats 93.23%)  
**Submitted:** 2026-10-21T10:57:09.562Z  

```java
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int pd = 0,sd = 0,sum = 0;
        int i=0,j=0;
        while(i<n && j<m)
        {
            pd=pd+mat[i][j];
            i++;j++;
        }
        i=0;j=m-1;
        while(i<n && j>=0)
        {
            if(i!=j)
            sd = sd + mat[i][j];
            i++;j--;
        }
        sum = pd + sd;
        return sum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/matrix-diagonal-sum/)