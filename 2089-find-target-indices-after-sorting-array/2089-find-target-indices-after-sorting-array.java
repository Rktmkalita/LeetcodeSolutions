class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l1 = new ArrayList<>();
        int count =0;
        int lessthan = 0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i])
                count++;
            else if(target>nums[i])
                lessthan++;
        }

        for(int i=0;i<count;i++){
            l1.add(lessthan++);
        }

        return l1;
    }
}