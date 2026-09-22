# Find First and Last Position of Element in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

 

 **Example 1:** 

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

```

 **Example 2:** 

```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

```

 **Example 3:** 

```
Input: nums = [], target = 0
Output: [-1,-1]

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109
- nums is a non-decreasing array.
- -109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 47.9 MB (beats 93.62%)  
**Submitted:** 2026-09-22T11:09:54.978Z  

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]= new int[2];
        int first=-1,last=-1;
        int l=0,h=nums.length-1,mid=0;
        
        while(l<=h)
        {
            mid=(l+h)/2;
            if(nums[mid]==target)
            {
                first=mid;
                h=mid-1;
            }
            else if(nums[mid]>target)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        res[0]=first;

        l=0;h=nums.length-1;
        
        while(l<=h)
        {
            mid=(l+h)/2;
            if(nums[mid]==target)
            {
                last=mid;
                l=mid+1;
            }
            else if(nums[mid]>target)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        res[1]=last;

        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)