class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(String s : operations){
            if(s.charAt(1)=='+')
                count++;
            else
                count--;
        }
        return count;
    }
}