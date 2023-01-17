class Solution {
    public int[][] floodFill(int[][] image, int row, int col, int color) {
        if(row<0 || col<0 || row>=image.length || col>=image[0].length || image[row][col]==color){
            return image;
        }
        dfs(image,row,col,color,image[row][col]);
        return image;
    }
    private void dfs(int[][] image, int row, int col, int color,int check){
        if(row<0 || col<0 || row>=image.length || col>=image[0].length || image[row][col]==color){
            return;
        }
        if(image[row][col]==check)
            image[row][col]=color;
        else
            return;
        dfs(image,row-1,col,color,check);
        dfs(image,row+1,col,color,check);
        dfs(image,row,col-1,color,check);
        dfs(image,row,col+1,color,check);
    }
}