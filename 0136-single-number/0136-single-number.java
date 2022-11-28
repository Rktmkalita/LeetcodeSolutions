class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
            }else{
                set.remove(i);
            }
        }
        return set.iterator().next();
    }
}