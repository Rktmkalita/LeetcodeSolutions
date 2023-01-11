class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int i;
        for(i=0;i<nums1.length;i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }
        for(i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int[] arr=new int[list.size()];
        for(i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}