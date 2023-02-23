class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(char ch:n.toCharArray()){
            int x = Integer.parseInt(ch+"");
            if(max<x)
                max=x;
        }
        return max;
    }
}