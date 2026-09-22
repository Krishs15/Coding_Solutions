# First and Last in Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a sorted array  **arr[]**  with possibly some duplicates, find the first and last occurrences of an element  **x**  in the given array.
 **Note:**  If the number  **x**  is not found in the array then return both the indices as -1.

 **Examples:** 

```
Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
Output: [2, 5]
Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5

```

```
Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
Output: [6, 6]
Explanation: First and last occurrence of 7 is at index 6

```

```
Input: arr[] = [1, 2, 3], x = 4
Output: [-1, -1]
Explanation: No occurrence of 4 in the array, so, output is [-1, -1]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T11:08:50.692Z  

```java
class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> res = new ArrayList<>();
        int first=-1,last=-1;
        int l=0, h=arr.length-1, mid=0;
        while(l<=h) 
        {
            mid=l+(h-l)/2;
            if (arr[mid]==x) 
            {
                first=mid;
                h=mid-1; 
            } 
            else if(arr[mid]>x) 
            {
                h=mid-1;
            } 
            else 
            {
                l=mid+1;
            }
        }
        res.add(first);
        
        l=0; h=arr.length-1;
        while (l<=h) 
        {
            mid=l+(h-l)/2;
            if (arr[mid]==x) 
            {
                last=mid;
                l=mid+1; 
            } 
            else if(arr[mid]>x) 
            {
                h=mid-1;
            } 
            else 
            {
                l=mid+1;
            }
        }
        res.add(last);
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1)