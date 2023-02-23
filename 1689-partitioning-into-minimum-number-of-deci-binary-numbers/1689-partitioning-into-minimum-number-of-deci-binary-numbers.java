class Solution {
    public int minPartitions(String n) {
        int max=Integer.MIN_VALUE;
        for(int k:n.toCharArray()){
            if(k-'0'==9)
                return 9;
            max=Math.max(max,k-'0');
        }
        return max;
    }
}