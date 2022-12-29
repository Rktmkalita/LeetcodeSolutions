class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        int temp=image[sr][sc];
        image[sr][sc]=color;
        if(sr-1>=0){
            if(image[sr-1][sc]==temp){
                floodFill(image,sr-1,sc,color);
            }
        }
        if(sr+1<image.length){
            if(image[sr+1][sc]==temp){
                floodFill(image,sr+1,sc,color);
            }
        }
        if(sc-1>=0){
            if(image[sr][sc-1]==temp){
                floodFill(image,sr,sc-1,color);
            }
        }
        if(sc+1<image[0].length){
            if(image[sr][sc+1]==temp){
                floodFill(image,sr,sc+1,color);
            }
        }
        return image;
    }
}