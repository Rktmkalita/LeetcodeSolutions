class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            int len=0;
            int[] counter = new int[256];
            for(int j=i;j<s.length();j++){
                if(counter[s.charAt(j)]==0){
                    len++;
                    counter[s.charAt(j)]++;
                }else
                    break;
            }
            if(len>maxlen){
                maxlen=len;
            }
        }
        return maxlen;
    }
}
