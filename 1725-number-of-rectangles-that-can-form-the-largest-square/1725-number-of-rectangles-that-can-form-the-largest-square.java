class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int n=rectangles.length;
        int count=1, max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
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