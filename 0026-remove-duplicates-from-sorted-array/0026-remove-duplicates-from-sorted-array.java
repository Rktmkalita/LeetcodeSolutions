class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==Integer.MAX_VALUE){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[j]=Integer.MAX_VALUE;
                    k++;
                }else{
                    break;
                }
            }
        }
        Arrays.sort(nums);
        return nums.length-k;
    }
}