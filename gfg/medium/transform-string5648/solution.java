// class Solution {
//     int transform(String s1, String s2) {
//         // code here
        
//         int l1=s1.length(),l2=s2.length();
//         if(l1==0||l2==0||l1!=l2)
//         return -1;
        
//         int i,p=0;
//         for(i=0;i<l2;i++)
//         {
//             if(s2.charAt(i)==s1.charAt(0))
//             {
//                 p=i+1;
//                 break;
//             }
//         }
//         String sub=s2.substring(0,p-1);
//         int sl=sub.length(),k=0;
        
//         for(i=0;i<l1;i++)
//         {
//             if(s1.charAt(i)==sub.charAt(sl-1))
//             return k;
//         }
        
//         sub=s1.substring(k-sl,sl);
//         String sb=sub+s1.substring(0,k-sl)+s1.substring(sl);
        
//         if(sb.equals(s2))
//         return sub.length()+1;
        
//         return -1;
//     }
// }
class Solution {
    int transform (String s1, String s2) {
        int l1=s1.length(), l2=s2.length();

        if (l1!=l2)
        return -1;
        
        int[] count = new int[128];
        for (int i=0;i<l1;i++) 
        {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i=0;i<128;i++)
        {
            if (count[i] != 0) 
            return -1;
        }
        
        int c=0,i=l1-1,j=l2-1;
        while(i>=0)
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                i--;j--;
            }
            else
            {
                c++;i--;
            }
        }
        return c;
    }
}