class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(target<nums[i])
                break;
            if(nums[i]==target)
                list.add(i);
        }
        return list;
    }
}