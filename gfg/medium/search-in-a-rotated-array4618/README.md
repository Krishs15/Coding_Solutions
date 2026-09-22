# Search in Rotated Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of  **distinct** elements, which was initially  **sorted in ascending order**  but then  **rotated**  at some unknown pivot, the task is to find the index of a target  **key**.  If the key is not present in the array, return  **-1**.

 **Examples :** 

```
Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
Output: 8
Explanation: 3 is found at index 8.
```

```
Input: arr[] = [3, 5, 1, 2], key = 6
Output: -1
Explanation: There is no element that has value 6.

```

```
Input: arr[] = [33, 42, 72, 99], key = 42
Output: 1
Explanation: 42 is found at index 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T11:28:26.205Z  

```java
class Solution {
    int search(int[] arr, int key) {
        // code here
        int low=0,high=arr.length-1,mid=0;
        
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            
            if(arr[low]<=arr[mid])
            {
                if(key>=arr[low] && key<arr[mid])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else
            {
                if((key)>arr[mid] && key<=arr[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1)