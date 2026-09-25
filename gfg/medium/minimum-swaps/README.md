# Minimum Swaps to Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.

 **Examples:** 

```
Input: arr[] = [2, 8, 5, 4]
Output: 1
Explanation: Swap 8 with 4 to get the sorted array.
```

```
Input: arr[] = [10, 19, 6, 3, 5]
Output: 2
Explanation: Swap 10 with 3 and 19 with 5 to get the sorted array.

```

```
Input: arr[] = [1, 3, 4, 5, 6]
Output: 0
Explanation: Input array is already sorted.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T18:26:46.133Z  

```java
class Solution {
    public int minSwaps(int arr[]) {
        // Code here
        int n=arr.length;
        int i,count=0;
        int temp[]=arr.clone();
        Arrays.sort(temp);
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(i=0;i<n;i++)
            map.put(arr[i],i);
            
        for(i=0;i<n;i++)
        {
            if(arr[i]!=temp[i])
            count++;
            
            int val=arr[i];
            int tval=temp[i];
            int pos=map.get(tval);
            
            arr[i]=tval;
            arr[pos]=val;
            map.put(tval,i);
            map.put(val,pos);
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-swaps/1)