class Solution {
    public String removeOccurrences(String s, String part) {
        int m=part.length();
        int n=s.length();
        if (m == 0) 
        return s;        
        int[] lps = new int[m];
        int l=0,i=1;
        
        while (i<m) 
        {
            if(part.charAt(i)==part.charAt(l)) 
            {
                l++;
                lps[i] = l;
                i++;
            } 
            else 
            {
                if (l!=0) 
                {
                    l=lps[l-1];
                } 
                else 
                {
                    lps[i]=0;
                    i++;
                }
            }
        }
        
        i=0; int j=0;
        while (i<n) 
        {
            if (part.charAt(j)==s.charAt(i)) 
            {
                i++; 
                j++;
            }
            if (j==m) 
            {
                s=s.substring(0,i-m) + s.substring(i);
                i=Math.max(0,i-2*m);
                j=0;
                n=s.length();
            } 
            else if (i<s.length()&&part.charAt(j)!=s.charAt(i)) 
            {
                if (j!=0) 
                {
                    j=lps[j-1];
                } 
                else 
                {
                    i++;
                }
            }
        }
        return s;
    }
}