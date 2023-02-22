class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] counter=new int[101];
        int[] returnArr = new int[2];
        for(int i:nums){
            counter[i]++;
        }
        for(int i=0;i<101;i++){
            if(counter[i]==0)
                continue;
            returnArr[0]+=counter[i]/2;
        }
        returnArr[1]=nums.length-returnArr[0]*2;
        return returnArr;
    }
}