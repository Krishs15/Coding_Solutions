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
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.9 MB (beats 99.85%)  
**Submitted:** 2026-10-22T03:52:59.824Z  

```java
// class Solution {
//     public String reverseOnlyLetters(String s) {
//         char[] st = s.toCharArray();
//         char[] rev = new char[s.length()];     
//         for (int i = 0; i < s.length(); i++) {
//             if ((st[i] < 'a' || st[i] > 'z') && (st[i] < 'A' || st[i] > 'Z')) {
//                 rev[i] = st[i];
//             }
//         }
//         int j = 0;
//         for (int i = s.length() - 1; i >= 0; i--) {
//             if ((st[i] >= 'a' && st[i] <= 'z') || (st[i] >= 'A' && st[i] <= 'Z')) {
//                 while (rev[j] != '\0') {
//                     j++;
//                 }
//                 rev[j] = st[i];
//             }
//         }

//         return new String(rev);
//     }
// }
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-only-letters/)