class Solution {
    public static int countSetBits(int n) {
        // code here
        n += 1; 
        int count = 0;
        int i = 0;
        
        while ((1 << i) <= n) 
        {
            int G = n / (1 << (i + 1));
            count += G * (1 << i);
            
            int r = n % (1 << (i + 1));
            count += Math.max(0, r - (1 << i));
            
            i++;
        }
        
        return count;
    }
}