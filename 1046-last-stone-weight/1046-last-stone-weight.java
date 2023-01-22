class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int b = 0, a = 0;
        if(stones.length == 1) return 1;
        for(int i = 0;i < stones.length; ++i) {
            pq.add(stones[i]);
        }
        while(pq.size() > 1) {
            int size = pq.size();
            a = pq.poll();
            if(!pq.isEmpty())
                b = pq.poll();
            if(a != b && size > 1) {
                pq.add(a - b);
            }
        }
        if(!pq.isEmpty())
            return pq.peek();
        return 0;
    }
}