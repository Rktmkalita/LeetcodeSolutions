class Solution {
    public int singleNumber(int[] nums) {
        int[] count = new int[60001];
        for(int i:nums){
            if(i<0){
                count[-i+30000]++;
            }else
                count[i]++;
        }
        int j=0;
        for(int i:count){
            if(i==1){
                if(j>30000){
                    j=j-30000;
                    j=-j;
                }
                return j;
            }
            j++;
        }
        return 0;
    }
}
