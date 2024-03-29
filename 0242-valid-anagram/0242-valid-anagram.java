class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null)
            return false;
        if(s.length()!=t.length())
            return false;
        int[] counter = new int[26];
        for(char ch:s.toCharArray()){
            counter[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            if(counter[ch-'a']<=0)
                return false;
            counter[ch-'a']--;
        }
        return true;
    }
}