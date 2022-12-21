class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int maxVal=0,maxKey=0;
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
            if(map.get(i)>maxVal){
                maxKey=i;
                maxVal=map.get(i);
            }
            if(maxVal>nums.length/2){
                return maxKey;
            }
        }
        return maxKey;
    }
}