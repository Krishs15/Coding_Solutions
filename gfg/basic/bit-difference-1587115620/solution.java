class Solution {
    public static int countBitsFlip(int a, int b) {
        // code here
        int count=0;
        int x=a^b;
        while(x>0)
        {
            if((x&1)==1)
            count++;
            
            x=x>>1;
        }
        return count;
    }
}
