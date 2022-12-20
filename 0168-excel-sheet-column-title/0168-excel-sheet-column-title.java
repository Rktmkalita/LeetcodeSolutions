class Solution {
    public String convertToTitle(int columnNumber) {
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
             System.out.println(pos+" "+str);
        }
        return str.reverse().toString();
    }
}