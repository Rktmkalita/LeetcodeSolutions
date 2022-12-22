class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())
            return false;
        int pos=0;
        for(int i=0;i<s.length();i++){
            int flag=0;
            for(int j=pos;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    flag=1;
                    pos=j+1;
                    break;
                }
            }
            if(flag==0){
                return false;
            }
        }
        return true;
    }
}