class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> res = new ArrayList<>();
        int l=0, h=arr.length-1, mid=0, p=-1;
        while(l<=h) 
        {
            mid=l+(h-l)/2;
            if (arr[mid]==x) 
            {
                p=mid;
                h=mid-1; 
            } 
            else if (arr[mid]>x) 
            {
                h=mid-1;
            } 
            else 
            {
                l=mid+1;
            }
        }
        res.add(p);
        
        l=0; h=arr.length-1; p=-1;
        while (l<=h) 
        {
            mid=l+(h-l)/2;
            if (arr[mid]==x) 
            {
                p=mid;
                l=mid+1; 
            } 
            else if (arr[mid]>x) 
            {
                h=mid-1;
            } 
            else 
            {
                l=mid+1;
            }
        }
        res.add(p);
        return res;
    }
}