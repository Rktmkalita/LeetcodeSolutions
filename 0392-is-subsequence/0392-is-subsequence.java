class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())
            return false;
        int pos=0;
        for(int i=0;i<s.length();i++){
            int flag=0;
            // char sch=s.charAt(i);
            for(int j=pos;j<t.length();j++){
                // char tch=t.charAt(j);
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