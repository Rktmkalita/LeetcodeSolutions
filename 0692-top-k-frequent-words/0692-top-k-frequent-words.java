class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        if(words.length==1)
            return Arrays.asList(words);
        
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) 
            map.put(word, map.getOrDefault(word, 0)+1);
        
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> map.get(a) == map.get(b) ? a.compareTo(b) : map.get(b) - map.get(a));
        
        for (String key : map.keySet())
            pq.add(key);
        
        List<String> res = new ArrayList<>();
        for (int i = 0; i < k; i++) 
            res.add(pq.poll());
        return res;
    }
}