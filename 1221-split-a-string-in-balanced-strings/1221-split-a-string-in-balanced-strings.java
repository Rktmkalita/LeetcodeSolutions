class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int countL=0,countR=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')
                countL++;
            else
                countR++;
            if(countL==countR){
                count++;
                countL=0;
                countR=0;
            }
                
        }
        return count;
    }
}