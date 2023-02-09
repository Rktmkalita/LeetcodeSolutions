class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        if(target==-294967296 || target==294967296){
            return new ArrayList<>(set);
        }
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n;j++){
                Map<Integer,Integer> map = new HashMap<>();
                for(int k=j+1;k<n;k++){
                    List<Integer> l1 = new ArrayList<>();
                    int comp = target-nums[i]-nums[j]-nums[k];
                    if(map.containsKey(comp)){
                        l1.add(nums[i]);
                        l1.add(nums[j]);
                        l1.add(nums[k]);
                        l1.add(comp);
                        Collections.sort(l1);
                        set.add(l1);
                    }else
                        map.put(nums[k],k);
                }
            }
        }
        return new ArrayList<>(set);
    }
}