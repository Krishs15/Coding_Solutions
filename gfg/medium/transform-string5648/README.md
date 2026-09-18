# Transform String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings  **s1**  and  **s2**. Find the minimum number of steps required to transform string s1 into string s2. The only allowed operation for the transformation is selecting a character from string s1 and inserting it in the beginning of string s1.

If transformation is not possible return  **-1**.

 **Examples:** 

```
Input: s1 = "abd", s2 = "bad"
Output: 1
Explanation: The conversion can take place in 1 operation: Pick 'b' and place it at the front.
```

```
Input: s1 = "GeeksForGeeks", s2 = "ForGeeksGeeks"
Output: 3
Explanation: The conversion can take place in 3 operations: 
Pick 'r' and place it at the front.
s1 = "rGeeksFoGeeks"
Pick 'o' and place it at the front.
s1 = "orGeeksFGeeks"
Pick 'F' and place it at the front.
s1 = "ForGeeksGeeks"
```

 **Constraints:** 
1<= s1.length(), s2.length() <= 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T04:24:10.719Z  

```java
// class Solution {
//     int transform(String s1, String s2) {
//         // code here
        
//         int l1=s1.length(),l2=s2.length();
//         if(l1==0||l2==0||l1!=l2)
//         return -1;
        
//         int i,p=0;
//         for(i=0;i<l2;i++)
//         {
//             if(s2.charAt(i)==s1.charAt(0))
//             {
//                 p=i+1;
//                 break;
//             }
//         }
//         String sub=s2.substring(0,p-1);
//         int sl=sub.length(),k=0;
        
//         for(i=0;i<l1;i++)
//         {
//             if(s1.charAt(i)==sub.charAt(sl-1))
//             return k;
//         }
        
//         sub=s1.substring(k-sl,sl);
//         String sb=sub+s1.substring(0,k-sl)+s1.substring(sl);
        
//         if(sb.equals(s2))
//         return sub.length()+1;
        
//         return -1;
//     }
// }
class Solution {
    int transform (String s1, String s2) {
        int l1=s1.length(), l2=s2.length();

        if (l1!=l2)
        return -1;
        
        int[] count = new int[128];
        for (int i=0;i<l1;i++) 
        {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i=0;i<128;i++)
        {
            if (count[i] != 0) 
            return -1;
        }
        
        int res=0,i=l1-1,j=l2-1;
        while(i>=0)
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                i--;j--;
            }
            else
            {
                res++;i--;
            }
        }
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/transform-string5648/1)