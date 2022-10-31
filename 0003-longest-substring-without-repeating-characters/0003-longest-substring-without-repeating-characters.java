class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hm = new HashSet<Character>();
        int len=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(!hm.contains(s.charAt(j))){
                    hm.add(s.charAt(j));
                }else{
                    break;
                }
            }
            if(len==s.length()){
                return len;
            }
            if(len<hm.size()){
                len=hm.size();
            }
            hm.clear();
        }
        return len;
    }
}