class Solution {
    public int maxSubArray(int[] nums) {
        int sumMax=nums[0];
        int sum=sumMax;
        for(int i=1;i<nums.length;i++){
            if(sum<0)
                sum=0;
            sum+=nums[i];
            if(sumMax<sum){
                sumMax=sum;
            }
        }
        return sumMax;
    }
}