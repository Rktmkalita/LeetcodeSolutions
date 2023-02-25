class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<Integer>();
        int len=words[0].length()*words.length;
        for(int i=0;i<=s.length()-len;i++){
            boolean flag=true;
            String curr = s.substring(i,i+len);
            Map<String,Integer> map = new HashMap<>();
            for(int j=0;j<=curr.length()-words[0].length();j+=words[0].length()){
                String substr = curr.substring(j,j+words[0].length());
                map.put(substr,map.getOrDefault(substr,0)+1);
            }
            for(String str:words){
                if(map.containsKey(str) && map.get(str)>0){
                    map.put(str,map.get(str)-1);
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        return list;
    }
}