class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = 0, b = 0;
        for (int i = 0; i < cost.length-1; ++i) {
            int c = Math.min(a + cost[i], b + cost[i+1]);
            a = b;
            b = c;
        }
        return b;
     }
}