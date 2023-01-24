class Solution {
    public int[] sortedSquares(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     nums[i]*=nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        int left=0,right=nums.length-1;
        int[] res=new int[nums.length];
        int k=nums.length-1;
        while(k>=0){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                res[k]=nums[left]*nums[left];
                left++;
                k--;
            }else{
                res[k]=nums[right]*nums[right];
                right--;
                k--;
            }
        }
        return res;
    }
}