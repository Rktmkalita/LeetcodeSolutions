class Solution {
    public int searchInsert(int[] nums, int target) {
        // int i=0;
        // while(i<nums.length && nums[i]<=target){
        //     i++;
        // }
        // return i-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}