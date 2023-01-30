class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len2=s2.length(), len1=s1.length();
        int[] s1counter=new int[26];
        for(char ch:s1.toCharArray()){
            s1counter[ch-'a']++;
        }
        for(int i=0;i<len2;i++){
            s1counter[s2.charAt(i)-'a']--;
            if(i-len1>=0)
                s1counter[s2.charAt(i-len1)-'a']++;
            if(allZero(s1counter)){
                return true;
            }
        }
        return false;
    }
    private boolean allZero(int[] arr){
        for(int i:arr){
            if(i!=0)
                return false;
        }
        return true;
    }
}