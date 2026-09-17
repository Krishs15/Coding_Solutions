class Solution {
    public String longestPrefix(String s) {
        int n=s.length();
        if(n==0)
        return "";
        int i=1,l=0;
        int lps[]= new int[n];
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(l))
            {
                l++;
                lps[i]=l;
                i++;
            }
            else
            {
                if(l!=0)
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
            String ps="";
            for(i=0;i<lps[n-1];i++)
            {
                ps=ps+s.charAt(i);
            }   
        return ps;
    }
}