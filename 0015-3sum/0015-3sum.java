class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int target = -nums[i];
            Map<Integer,Integer> map = new HashMap<>();
            for(int j=i;j<n;j++){
                int complement = target - nums[j];
                if (map.containsKey(complement)) {
                    int k=map.get(complement);
                    if(i!=j && j!=k && k!=i){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(complement);
                        temp.add(nums[j]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
                map.put(nums[j], j);
            }
        }
        return new ArrayList<>(set);
    }
}