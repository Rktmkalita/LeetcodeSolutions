class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxCount=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    maxCount=Math.max(maxCount,dfs(grid,i,j));
                }
            }
        }
        return maxCount;
    }
    public int dfs(int[][] grid, int row, int col){
        // int count=0;
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]!=1){
            return 0;
        }
        // if(grid[row][col]==1){
        //     grid[row][col]=0;
        //     count+=dfs(grid,row-1,col)+dfs(grid,row+1,col)+dfs(grid,row,col-1)+dfs(grid,row,col+1)+1;
        // }
        grid[row][col]=0;
        return dfs(grid,row-1,col)+dfs(grid,row+1,col)+dfs(grid,row,col-1)+dfs(grid,row,col+1)+1;
    }
}