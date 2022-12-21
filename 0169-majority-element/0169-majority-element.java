class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2]; //after sorting the max val will atleast cross n/2 position
    }
}