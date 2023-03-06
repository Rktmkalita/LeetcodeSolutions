class Solution {
    public int[] findBall(int[][] grid) {
        int n=grid[0].length;
        int m=grid.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            int l=0,r=i;
            boolean flag=true;
            while(l<m){
                if(grid[l][r]==1){
                    if((r<n-1 && grid[l][r+1]==-1) || r==n-1){
                        res[i]=-1;
                        flag=false;
                        break;
                    }
                    l++;
                    r++;
                }else {
                    if(r==0 || (r>0 && grid[l][r-1]==1)){
                        res[i]=-1;
                        flag=false;
                        break;
                    }
                    l++;
                    r--;
                }
            }
            if(flag==true)
                res[i]=r;
        }
        return res;
    }
}