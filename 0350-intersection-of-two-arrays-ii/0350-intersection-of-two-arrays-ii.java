class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int counter[]=new int[1001];
        for(int i:nums1){
            counter[i]++;
        }
        for(int num:nums2){
            if(counter[num]>0){
                list.add(num);
                counter[num]--;
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}