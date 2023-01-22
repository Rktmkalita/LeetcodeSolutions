class Solution {
    public int lastStoneWeight(int[] stones) {
        int i=stones.length-1;
        while(i>0){
            Arrays.sort(stones);
            int y=stones[i];
            int x=stones[i-1];
            System.out.println(y);
            if(y==x){
                stones[i]=Integer.MAX_VALUE;
                stones[i-1]=Integer.MAX_VALUE;
                i--;
            }else{
                stones[i]=Integer.MAX_VALUE;
                stones[i-1]=y-x;
            }
            i--;
        }
        if(stones[0]==Integer.MAX_VALUE){
            return 0;
        }
        return stones[0];
    }
}