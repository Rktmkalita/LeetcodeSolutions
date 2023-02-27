class Solution {
    public boolean canBeIncreasing(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int temp = list.get(i);
            list.remove(i);
            if(checkArr(list))
                return true;
            list.add(i,temp);
        }
        return false;
    }
    public boolean checkArr(List<Integer> list){
        for(int i=1;i<list.size();i++){
           if(list.get(i-1)>=list.get(i))
               return false;
        }
        return true;
    }
}