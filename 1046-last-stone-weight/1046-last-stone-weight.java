class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        int y=0;
        for(;y<stones.length;y++){
            pQueue.add(stones[y]);
        }
        while(!pQueue.isEmpty()){
            y=pQueue.poll();
            if(pQueue.peek()!=null){
                y=y-pQueue.poll();
                if(y!=0){
                    pQueue.add(y);
                }
            }
        }
        return y;
    }
}