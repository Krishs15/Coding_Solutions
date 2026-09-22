class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]= new int[2];
        int first=-1,last=-1;
        int l=0,h=nums.length-1,mid=0;
        
        while(l<=h)
        {
            mid=(l+h)/2;
            if(nums[mid]==target)
            {
                first=mid;
                h=mid-1;
            }
            else if(nums[mid]>target)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        res[0]=first;

        l=0;h=nums.length-1;
        
        while(l<=h)
        {
            mid=(l+h)/2;
            if(nums[mid]==target)
            {
                last=mid;
                l=mid+1;
            }
            else if(nums[mid]>target)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        res[1]=last;

        return res;
    }
}