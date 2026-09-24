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