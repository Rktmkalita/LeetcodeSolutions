class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0,p=1;
        for(int i=0;i<columnTitle.length();i++){
            sum+=(columnTitle.charAt(columnTitle.length()-1-i)-64)*p;
            p=p*26;
        }
        return sum;
    }
}