class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> res = new ArrayList<>();
        int first=-1,last=-1;
        int l=0, h=arr.length-1, mid=0;
        while(l<=h) 
        {
            mid=l+(h-l)/2;
            if (arr[mid]==x) 
            {
                first=mid;
                h=mid-1; 
            } 
            else if(arr[mid]>x) 
            {
                h=mid-1;
            } 
            else 
            {
                l=mid+1;
            }
        }
        res.add(first);
        
        l=0; h=arr.length-1;
        while (l<=h) 
        {
            mid=l+(h-l)/2;
            if (arr[mid]==x) 
            {
                last=mid;
                l=mid+1; 
            } 
            else if(arr[mid]>x) 
            {
                h=mid-1;
            } 
            else 
            {
                l=mid+1;
            }
        }
        res.add(last);
        return res;
    }
}