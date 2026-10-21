class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int pd = 0,sd = 0,sum = 0;
        int i=0,j=0;
        while(i<n && j<m)
        {
            pd=pd+mat[i][j];
            i++;j++;
        }
        i=0;j=m-1;
        while(i<n && j>=0)
        {
            if(i!=j)
            sd = sd + mat[i][j];
            i++;j--;
        }
        sum = pd + sd;
        return sum;
    }
}