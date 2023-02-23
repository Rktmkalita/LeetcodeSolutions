class Solution {
    public int minPartitions(String n) {
        int max=Integer.MIN_VALUE;
        for(int k:n.toCharArray()){
            max=Math.max(max,k-'0');
        }
        return max;
    }
}