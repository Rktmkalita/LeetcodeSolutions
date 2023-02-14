class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sbr = new StringBuilder();
        for(int i=0;i<address.length();i++){
            char ch = address.charAt(i);
            if(ch=='.'){
                sbr.append("[.]");
            }else{
                sbr.append(ch+"");
            }
        }
        return sbr.toString();
    }
}