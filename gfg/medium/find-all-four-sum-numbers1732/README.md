# 4 Sum - All Quadruples

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of integers and another integer  **target**. You have to find all  **unique** quadruples from the given array whose  **sum** is equal to the given  **target**.

 **Note:**  All the quadruples should be internally sorted, i.e for any quadruple [q1, q2, q3, q4] it should be : q1 ≤ q2 ≤ q3 ≤ q4.

 **Examples :** 

```
Input: arr[] = [0, 0, 2, 1, 1], target = 3
Output: [[0, 0, 1, 2]]
Explanation: Sum of 0, 0, 1, 2 is equal to 3.

```

```
Input: arr[] = [10, 2, 3, 4, 5, 7, 8], target = 23
Output: [[2, 3, 8, 10], [2, 4, 7, 10], [3, 5, 7, 8]] 
Explanation: Sum of [2, 3, 8, 10] is 23, sum of [2, 4, 7, 10] is 23 and sum of [3, 5, 7, 8] is also 23.
```

```
Input: arr[] = [0, 0, 2, 1, 1], target = 2
Output: [[0, 0, 1, 1]]
Explanation: Sum of [0, 0, 1, 1] is equal to 2.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T04:46:41.185Z  

```java
class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        int i,j;
        for(i=0;i<n-3;i++)
        {
            for(j=i+1;j<n-2;j++)
            {
                int left=j+1;
                int right=n-1;
                while(left<right)
                {
                    int sum = arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum==target)
                    {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[left]);
                        temp.add(arr[right]);
                        if (!map.containsKey(temp)) 
                        {
                            res.add(temp);         
                            map.put(temp, 1);
                        }
                        left++;
                        right--;
                    }
                    else if(sum<target)
                    left++;
                    else
                    right--;
                    
                }
            }
        }
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1)