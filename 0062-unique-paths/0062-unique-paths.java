class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0)continue;
                int up=0,left=0;
                if(i>0)up=dp[i-1][j];
                if(j>0)left=dp[i][j-1];
                dp[i][j]=up+left;
            }
        }
        return dp[m-1][n-1];
    }
    int helper(int[][] mat, int x, int y){
        // System.out.println(x+" "+y);
        if(x>=mat.length || y>=mat[0].length || mat[x][y]==1)
            return 0;
        
        if(x==mat.length-1 && y==mat[0].length-1){
            return helper(mat,x,y+1)+helper(mat,x+1,y)+1;
        }else{
            return helper(mat,x,y+1)+helper(mat,x+1,y);
        }
        
    }
}