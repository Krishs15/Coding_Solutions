# Longest Common Prefix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

 

 **Example 1:** 

```
Input: strs = ["flower","flow","flight"]
Output: "fl"

```

 **Example 2:** 

```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

```

 

 **Constraints:** 

- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lowercase English letters if it is non-empty.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 59.95%)  
**Memory:** 43.2 MB (beats 67.36%)  
**Submitted:** 2026-09-18T05:12:23.228Z  

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)
        return "";
        for(int i=0;i<strs[0].length();i++)
        {
            char c=strs[0].charAt(i);
            for(int k=1;k<strs.length;k++)
            {
                if(i==strs[k].length()||strs[k].charAt(i)!=c)
                {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-common-prefix/)