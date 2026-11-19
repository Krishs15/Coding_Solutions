# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

Original
Java
 **Example 1:** 

 **Input:** 
String s = "()";

 **Output:**  true

 **Example 2:** 

 **Input:** 
String s = "()[]{}";

 **Output:**  true

 **Example 3:** 

 **Input:** 
String s = "(]";

 **Output:**  false

 **Example 4:** 

 **Input:** 
String s = "([])";

 **Output:**  true

 **Example 5:** 

 **Input:** 
String s = "([)]";

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 85.52%)  
**Memory:** 42.6 MB (beats 91.55%)  
**Submitted:** 2026-11-19T04:17:37.881Z  

```java
class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length() % 2 != 0)
        return false;

        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i=0 ; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char top = stack.pop();
                if(!matches(top, c))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean matches(char open, char close)
    {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)