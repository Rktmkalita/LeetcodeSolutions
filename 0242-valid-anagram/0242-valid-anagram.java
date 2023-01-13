class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] counter = new char[26];
        for(char ch:s.toCharArray()){
            counter[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            if(counter[ch-'a']<=0)
                return false;
            counter[ch-'a']--;
        }
        for(char ch='a';ch<='z';ch++){
            if(counter[ch-'a']!=0)
                return false;
        }
        return true;
    }
}