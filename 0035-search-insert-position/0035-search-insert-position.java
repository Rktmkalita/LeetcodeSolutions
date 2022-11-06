class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        
        if(nums[0]>=target){
            return 0;
        }
        if(nums[n-1]<target){
            return n;
        }
        
        for(int i=1;i<n;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return n;
    }
}