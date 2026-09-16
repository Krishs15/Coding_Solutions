class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length(),m=needle.length();
        int [] lps= new int[m];
        int l=0,i=1;

        if(m==0 || m>n)
        return -1;

        while(i<m)
        {
            if(needle.charAt(i)==needle.charAt(l))
            {
                l++;
                lps[i]=l;
                i++;
            }
            else
            {
                if(l==0)
                {
                    lps[i]=0; i++;
                }
                else
                {
                    l=lps[l-1];
                }
            }
        }

        i=0;int j=0;
        while(i<n)
        {
            if(needle.charAt(j)==haystack.charAt(i))
            {
                i++;j++;
            }
            if(j==m)
            {
                return i-j;
            }
            else if(i<n && needle.charAt(j)!=haystack.charAt(i))
            {
                if(j!=0)
                {
                    j=lps[j-1];
                }
                else
                {
                    i++;
                }
            }
        }
        return -1;
    }
}