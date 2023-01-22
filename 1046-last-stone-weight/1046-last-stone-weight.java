class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i:stones){
            pQueue.add(i);
        }
        int y=0;
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