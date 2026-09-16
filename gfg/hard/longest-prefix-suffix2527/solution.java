class Solution {
    int getLPSLength(String s) {
        int n = s.length();
        int[] p = new int[n];
        int len = 0;
        int i = 1;
        while (i < n) 
        {
            if (s.charAt(i) == s.charAt(len)) 
            {
                len++;
                p[i] = len;
                i++;
            } 
            else 
            {
                if (len != 0) 
                {
                    len = p[len - 1];
                } 
                else 
                {
                    p[i] = 0;
                    i++;
                }
            }
        }
        return p[n - 1];
    }
}