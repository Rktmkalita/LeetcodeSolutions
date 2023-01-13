class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.lastIndexOf(ch)==s.indexOf(ch)){
                return i;
            }
        }
        return -1;
    }
}