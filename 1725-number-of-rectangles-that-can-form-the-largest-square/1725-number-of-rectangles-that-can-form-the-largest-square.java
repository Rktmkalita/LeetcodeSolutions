class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int n=rectangles.length;
        int count=1, max=Math.min(rectangles[0][0],rectangles[0][1]);
        for(int i=1;i<n;i++){
            int side = Math.min(rectangles[i][0],rectangles[i][1]);
            if(max<side){
                max=side;
                count=1;
            }else if(max==side){
                count++;
            }
        }
        return count;
    }
}