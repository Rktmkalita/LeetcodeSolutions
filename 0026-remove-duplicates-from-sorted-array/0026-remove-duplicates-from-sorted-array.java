class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length-1-k;i++){
            if(nums[i]==nums[i+1]){
                for(int j=i;j<nums.length-1-k;j++){
                    nums[j]=nums[j+1];
                }
                k++;
                i--;
            }
        }
        return nums.length-k;
    }
}