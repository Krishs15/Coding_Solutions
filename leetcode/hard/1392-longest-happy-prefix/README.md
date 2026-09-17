# Longest Happy Prefix

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

A string is called a  **happy prefix**  if it is a  **non-empty**  prefix which is also a suffix (excluding itself).

Given a string `s`, return  *the  **longest happy prefix**  of*  `s`. Return an empty string `""` if no such prefix exists.

 

 **Example 1:** 

```
Input: s = "level"
Output: "l"
Explanation: s contains 4 prefix excluding itself ("l", "le", "lev", "leve"), and suffix ("l", "el", "vel", "evel"). The largest prefix which is also suffix is given by "l".

```

 **Example 2:** 

```
Input: s = "ababab"
Output: "abab"
Explanation: "abab" is the largest prefix which is also suffix. They can overlap in the original string.

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s contains only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 782 ms (beats 5.21%)  
**Memory:** 53 MB (beats 5.66%)  
**Submitted:** 2026-09-17T03:58:27.499Z  

```java
class Solution {
    public String longestPrefix(String s) {
        int n=s.length();
        if(n==0)
        return "";
        int i=1,l=0;
        int lps[]= new int[n];
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(l))
            {
                l++;
                lps[i]=l;
                i++;
            }
            else
            {
                if(l!=0)
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
            String ps="";
            for(i=0;i<lps[n-1];i++)
            {
                ps=ps+s.charAt(i);
            }   
        return ps;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-happy-prefix/)