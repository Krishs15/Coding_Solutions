class Solution {
    public int findStepKeyIndex(int[] arr, int k, int x) {
        // code here
        
        int n=arr.length;
        int i=0;
        while(i<n)
        {
            if(arr[i]==x)
            return i;
            
            int dif=Math.max(1,Math.abs((arr[i]-x)/k));
            i=i+dif;
        }
        
        return -1;
    }
}