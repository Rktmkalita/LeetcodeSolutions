class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int left=0,right=n-1;
        
        if(nums[0]>=target){
            return 0;
        }
        if(nums[n-1]<target){
            return n;
        }
        
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        
        return right+1;
    }
}