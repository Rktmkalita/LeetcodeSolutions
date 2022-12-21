class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sumL[] = new int[n];
        int sumR[] = new int[n];
        sumL[0]=nums[0];
        sumR[0]=nums[n-1];
        for(int i=1;i<n;i++){
            sumL[i]=sumL[i-1]+nums[i];
            sumR[i]=sumR[i-1]+nums[n-1-i];
        }
        for(int i=0;i<n;i++){
            if(sumL[i]==sumR[n-1-i]){
                return i;
            }
        }
        return -1;
    }
}