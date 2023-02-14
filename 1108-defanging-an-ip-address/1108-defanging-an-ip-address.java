class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sbr = new StringBuilder();
        for(char ch : address.toCharArray()){
            if(ch=='.'){
                sbr.append("[.]");
            }else{
                sbr.append(ch+"");
            }
        }
        return sbr.toString();
    }
}