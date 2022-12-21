class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0,p=1;
        for(int i=0;i<columnTitle.length();i++){
            char ch = columnTitle.charAt(columnTitle.length()-1-i);
            // int p = (int)Math.pow(26,i);
            sum+=(ch-64)*p;
            p=p*26;
        }
        return sum;
    }
}