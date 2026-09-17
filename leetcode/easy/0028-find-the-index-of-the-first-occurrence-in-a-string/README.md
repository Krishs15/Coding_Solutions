# Find the Index of the First Occurrence in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

 

 **Example 1:** 

```
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

```

 **Example 2:** 

```
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

```

 

 **Constraints:** 

- 1 <= haystack.length, needle.length <= 104
- haystack and needle consist of only lowercase English characters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 8.67%)  
**Memory:** 42.8 MB (beats 91.42%)  
**Submitted:** 2026-09-17T04:13:44.948Z  

```java
class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length(),m=needle.length();
        int [] lps= new int[m];
        int l=0,i=1;

        if(m==0 || m>n)
        return -1;

        while(i<m)
        {
            if(needle.charAt(i)==needle.charAt(l))
            {
                l++;
                lps[i]=l;
                i++;
            }
            else
            {
                if(l==0)
                {
                    lps[i]=0; i++;
                }
                else
                {
                    l=lps[l-1];
                }
            }
        }

        i=0;int j=0;
        while(i<n)
        {
            if(needle.charAt(j)==haystack.charAt(i))
            {
                i++;j++;
            }
            if(j==m)
            {
                return i-j;
            }
            else if(i<n && needle.charAt(j)!=haystack.charAt(i))
            {
                if(j!=0)
                {
                    j=lps[j-1];
                }
                else
                {
                    i++;
                }
            }
        }
        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)