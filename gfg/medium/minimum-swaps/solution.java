class Solution {
    public int minSwaps(int arr[]) {
        // Code here
        int n=arr.length;
        int i,count=0;
        int temp[]=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<n;i++)
        {
            map.put(arr[i],i);
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]!=temp[i])
            count++;
            
            int val=arr[i];
            int tval=temp[i];
            int pos=map.get(tval);
            
            arr[i]=tval;
            arr[pos]=val;
            map.put(tval,i);
            map.put(val,pos);
        }
        return count;
    }
}