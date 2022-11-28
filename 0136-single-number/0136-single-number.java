class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for(int i:nums){
            if(!numSet.contains(i)){
                numSet.add(i);
            }else{
                numSet.remove(i);
            }
        }
        return numSet.iterator().next();
    }
}