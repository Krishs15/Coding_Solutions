# Remove All Occurrences of a Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s` and `part`, perform the following operation on `s` until  **all**  occurrences of the substring `part` are removed:

- Find the leftmost occurrence of the substring part and remove it from s.

Return `s` *after removing all occurrences of* `part`.

A  **substring**  is a contiguous sequence of characters in a string.

 

 **Example 1:** 

```
Input: s = "daabcbaabcbc", part = "abc"
Output: "dab"
Explanation: The following operations are done:
- s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
- s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
- s = "dababc", remove "abc" starting at index 3, so s = "dab".
Now s has no occurrences of "abc".

```

 **Example 2:** 

```
Input: s = "axxxxyyyyb", part = "xy"
Output: "ab"
Explanation: The following operations are done:
- s = "axxxxyyyyb", remove "xy" starting at index 4 so s = "axxxyyyb".
- s = "axxxyyyb", remove "xy" starting at index 3 so s = "axxyyb".
- s = "axxyyb", remove "xy" starting at index 2 so s = "axyb".
- s = "axyb", remove "xy" starting at index 1 so s = "ab".
Now s has no occurrences of "xy".

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- 1 <= part.length <= 1000
- s​​​​​​ and part consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 24.35%)  
**Memory:** 44.5 MB (beats 40.28%)  
**Submitted:** 2026-09-22T10:10:02.111Z  

```java
class Solution {
    public String removeOccurrences(String s, String part) {
        int m=part.length();
        int n=s.length();
        if (m == 0) 
        return s;        
        int[] lps = new int[m];
        int l=0,i=1;
        
        while (i<m) 
        {
            if(part.charAt(i)==part.charAt(l)) 
            {
                l++;
                lps[i] = l;
                i++;
            } 
            else 
            {
                if (l!=0) 
                {
                    l=lps[l-1];
                } 
                else 
                {
                    lps[i]=0;
                    i++;
                }
            }
        }
        
        i=0; int j=0;
        while (i<n) 
        {
            if (part.charAt(j)==s.charAt(i)) 
            {
                i++; 
                j++;
            }
            if (j==m) 
            {
                s=s.substring(0,i-m) + s.substring(i);
                i=Math.max(0,i-2*m);
                j=0;
                n=s.length();
            } 
            else if (i<s.length()&&part.charAt(j)!=s.charAt(i)) 
            {
                if (j!=0) 
                {
                    j=lps[j-1];
                } 
                else 
                {
                    i++;
                }
            }
        }
        return s;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-all-occurrences-of-a-substring/)