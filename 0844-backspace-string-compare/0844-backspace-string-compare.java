class Solution {
    public boolean backspaceCompare(String s, String t) {
        if(helper(s).equals(helper(t)))
            return true;
        return false;
    }
    private String helper(String s){
        char[] chArr = s.toCharArray();
        String str="";
        for(char ch:chArr){
            if(ch=='#' && str.length()>0){
                str=str.substring(0,str.length()-1);
            }else if(ch=='#'){
                continue;
            }else{
                str+=ch;
            }
        }
        return str;
    }
}