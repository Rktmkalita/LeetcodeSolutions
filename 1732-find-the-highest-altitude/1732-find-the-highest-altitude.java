class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int count=0;
        for(int i:gain){
            count+=i;
            if(max<count){
                max=count;
            }
        }
        return max;
    }
}