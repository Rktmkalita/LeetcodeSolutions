class Solution {
    public int firstUniqChar(String s) {
        int index=Integer.MAX_VALUE;
        for(char ch='a';ch<='z';ch++){
            int i=s.indexOf(ch);
            if(i!=-1 && s.lastIndexOf(ch)==i){
                 index=index>i?i:index;
            }
        }
        if(index!=Integer.MAX_VALUE)
            return index;
        return -1;
    }
}