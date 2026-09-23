# Search in a K-Step Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a step array arr[], a step value k, and an integer x, find the first index of x in the array. If x is not present, return -1.

Note: A K-Step array is an array where the absolute difference between any two adjacent elements is at most k.

For example, arr[]= [4, 6, 7, 9]  with k= 2 is a step array because the difference between consecutive elements is ≤ 2.

 **Examples :** 

```
Input: arr[] = [4, 5, 6, 7, 6], k = 1, x = 6
Output: 2
Explanation: In the array arr, 6 is present at index 2. So, return 2.

```

```
Input: arr[] = [20, 40, 50], k = 20, x = 70
Output: -1 
Explanation: As there is no occurrence of 70. So, return -1.
```

 **Constraints:** 
1 ≤ arr.size ≤ 105
1 ≤ k ≤ 100
1 ≤ arr[i], x ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T10:44:13.532Z  

```java
class Solution {
    public int findStepKeyIndex(int[] arr, int k, int x) {
        // code here
        
        int n=arr.length;
        int i=0;
        while(i<n)
        {
            if(arr[i]==x)
            return i;
            
            int dif=Math.max(1,Math.abs((arr[i]-x)/k));
            i=i+dif;
        }
        
        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/searching-in-an-array-where-adjacent-differ-by-at-most-k0456/1)