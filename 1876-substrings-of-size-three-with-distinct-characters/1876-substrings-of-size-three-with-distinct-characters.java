class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<=s.length()-3;i++){
            boolean flag=true;
            String str = s.substring(i,i+3);
            if(str.lastIndexOf(str.charAt(0))==0 && str.lastIndexOf(str.charAt(1))==1)
                count++;
        }
        return count;
    }
}