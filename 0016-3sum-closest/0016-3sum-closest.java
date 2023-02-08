class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int finalSum = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target)
                    return sum;
                else if(sum>target){
                    right--;
                }else if(target>sum){
                    left++;
                }
                if(Math.abs(target-finalSum)>Math.abs(target-sum)){
                    finalSum=sum;
                }
                sum=nums[i];
            }
        }
        return finalSum;
    }
}