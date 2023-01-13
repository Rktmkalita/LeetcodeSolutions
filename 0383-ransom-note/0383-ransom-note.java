class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length())
            return false;
        int[] magcount = new int[26];
        for(int i=0;i<magazine.length();i++){
            magcount[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(magcount[ch-'a']<=0){
                return false;
            }else{
                magcount[ch-'a']--;
            }
        }
        return true;
    }
}