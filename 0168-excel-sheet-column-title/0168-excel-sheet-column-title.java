class Solution {
    public String convertToTitle(int columnNumber) {
        if (columnNumber >= 1 && columnNumber <= 26)
            return String.valueOf((char)(columnNumber + 64));
        StringBuilder str = new StringBuilder();    
        while(columnNumber>0){
            int pos=columnNumber%26;
            if(pos!=0){
                str.append(String.valueOf((char)(pos + 64)));
            }else{
                str.append("Z");
            }
            columnNumber=columnNumber/26;
            if(pos==0){
                columnNumber--;
            }
        }
        return str.reverse().toString();
    }
}