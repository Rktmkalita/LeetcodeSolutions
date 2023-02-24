class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] counter1 = new int[1001];
        for(int i:nums1){
            counter1[i]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i:nums2){
            if(counter1[i]>0){
                list.add(i);
                counter1[i]=0;
            }
        }
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}