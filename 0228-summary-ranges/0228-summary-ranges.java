class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length==0)
            return list;
        int n=nums.length;
        int left = nums[0];
        int right =nums[0];
        for(int i=0;i<n;i++){
            left=nums[i];
            while(i+1<n && nums[i]+1==nums[i+1]){
                i++;
            }
            right = nums[i];
            if(left!=right)
                list.add(left+"->"+right);
            else
                list.add(left+"");
        }
        return list;
    }
}