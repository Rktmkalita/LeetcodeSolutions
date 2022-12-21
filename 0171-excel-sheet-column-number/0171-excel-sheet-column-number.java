class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        for(int i=0;i<columnTitle.length();i++){
            char ch = columnTitle.charAt(columnTitle.length()-1-i);
            int p = (int)Math.pow(26,i);
            sum+=(ch-64)*p;
        }
        return sum;
    }
}