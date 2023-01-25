class Solution {
    public void moveZeroes(int[] nums) {
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0){
                while(j<nums.length){
                    if(nums[j]!=0){
                        int temp = nums[j];
                        nums[j]=nums[i];
                        nums[i]=temp;
                        break;
                    }
                    j++;
                }
                // for(int j=i+1;j<nums.length;j++){
                //     if(nums[j]!=0){
                //         int temp = nums[j];
                //         nums[j]=nums[i];
                //         nums[i]=temp;
                //         break;
                //     }
                // }
            }else{
                j++;
            }
        }
    }
}