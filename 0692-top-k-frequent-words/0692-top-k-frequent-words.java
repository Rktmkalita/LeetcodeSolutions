class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        if(words.length==1)
            return Arrays.asList(words);
        
        List<String> list=new ArrayList<>();
        
        Map<String,Integer> map=new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        
        List<Map.Entry<String, Integer>> temp = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        temp.sort((a,b)->{
            int x=-a.getValue().compareTo(b.getValue());
            if(x==0){
                return a.getKey().compareTo(b.getKey());
            }else{
                return x;
            }
        });
        for(Map.Entry<String, Integer> e:temp){
            list.add(e.getKey());
            k--;
            if(k==0)
                break;
        }
        return list;
    }
}