class Solution {
    public String reverseWords(String s) {
        StringBuilder sbr = new StringBuilder();
        for(String str:s.trim().split("\\s+")){
            StringBuilder temp = new StringBuilder(str);
            temp.reverse();
            sbr.append(temp+" ");
        }
        return sbr.toString().trim();
    }
}