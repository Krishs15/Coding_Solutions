# Reverse Only Letters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse the string according to the following rules:

- All the characters that are not English letters remain in the same position.
- All the English letters (lowercase or uppercase) should be reversed.

Return `s` *after reversing it*.

 

 **Example 1:** 

```
Input: s = "ab-cd"
Output: "dc-ba"

```

 **Example 2:** 

```
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

```

 **Example 3:** 

```
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of characters with ASCII values in the range [33, 122].
- s does not contain '\"' or '\\'.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 25.64%)  
**Memory:** 42.6 MB (beats 86.28%)  
**Submitted:** 2026-10-21T11:13:05.167Z  

```java
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] st = s.toCharArray();
        char[] rev = new char[s.length()];     
        for (int i = 0; i < s.length(); i++) {
            if ((st[i] < 'a' || st[i] > 'z') && (st[i] < 'A' || st[i] > 'Z')) {
                rev[i] = st[i];
            }
        }
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((st[i] >= 'a' && st[i] <= 'z') || (st[i] >= 'A' && st[i] <= 'Z')) {
                while (rev[j] != '\0') {
                    j++;
                }
                rev[j] = st[i];
            }
        }
        
        return new String(rev);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-only-letters/)