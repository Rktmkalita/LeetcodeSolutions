class Solution {
    public int maximum69Number (int num) {
        char[] chArr = String.valueOf(num).toCharArray();
        for(int i=0;i<chArr.length;i++){
            if(chArr[i]=='6'){
                chArr[i]='9';
                break;
            }
        }
        StringBuilder sbr = new StringBuilder();
        for(char ch:chArr){
            sbr.append(ch);
        }
        return Integer.parseInt(sbr.toString());
    }
}