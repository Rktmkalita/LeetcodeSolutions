class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<=s.length()-3;i++){
            boolean flag=true;
            String str = s.substring(i,i+3);
            for(int j=0;j<2;j++){
                char ch=str.charAt(j);
                if(str.lastIndexOf(ch)!=j){
                    flag=false;
                    break;
                }
            }
            if(flag)
                count++;
        }
        return count;
    }
}