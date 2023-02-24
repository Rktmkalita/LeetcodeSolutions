class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time=0;
        for(int i=1;i<points.length;i++){
            int x1=points[i-1][0];
            int x2=points[i][0];
            int y1=points[i-1][1];
            int y2=points[i][1];
            // if(x1==x2 && y2!=y1){
            //     time+=Math.abs(y2-y1);
            // }else if(x2!=x1 && y2==y1){
            //     time+=Math.abs(x2-x1);
            // }else if(x2!=x1 && y2!=y1){
            //     time+=Math.max(Math.abs(x2-x1),Math.abs(y2-y1));
            // }
            time+=Math.max(Math.abs(x2-x1),Math.abs(y2-y1));
        }
        return time;
    }
}