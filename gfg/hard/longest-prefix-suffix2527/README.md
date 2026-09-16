# Longest Prefix Suffix

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string  **s**, of lowercase english alphabets, find the length of the longest proper prefix which is also a suffix.
 **Note:**  Prefix and suffix can be overlapping but they should not be equal to the entire string.

 **Examples :** 

```
Input: s = "abab"
Output: 2
Explanation: The string "ab" is the longest prefix and suffix. 
```

```
Input: s = "aabcdaabc"
Output: 4
Explanation: The string "aabc" is the longest prefix and suffix.

```

```
Input: s = "aaaa"
Output: 3
Explanation: "aaa" is the longest prefix and suffix. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T11:06:09.330Z  

```java
class Solution {
    int getLPSLength(String s) {
        int n = s.length();
        int[] p = new int[n];
        int len = 0;
        int i = 1;
        while (i < n) 
        {
            if (s.charAt(i) == s.charAt(len)) 
            {
                len++;
                p[i] = len;
                i++;
            } 
            else 
            {
                if (len != 0) 
                {
                    len = p[len - 1];
                } 
                else 
                {
                    p[i] = 0;
                    i++;
                }
            }
        }
        return p[n - 1];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-prefix-suffix2527/1)