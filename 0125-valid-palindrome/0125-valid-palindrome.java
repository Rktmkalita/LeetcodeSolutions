class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char[] ch = new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || (s.charAt(i)>='a' && s.charAt(i)<='z')){
                ch[j]=s.charAt(i);
                j++;
            }
        }
        int i=0;
        j--;
        while(i<j){
            if(ch[i]!=ch[j]){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}