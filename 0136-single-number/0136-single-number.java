class Solution {
    public int singleNumber(int[] nums) {
        int sum=0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
                sum+=i;
            }else{
                set.remove(i);
                sum-=i;
            }
        }
        return sum;
    }
}