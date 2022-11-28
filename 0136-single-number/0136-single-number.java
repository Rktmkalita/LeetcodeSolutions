class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        for (var num: nums) {
            sum = sum ^ num;
        }
        return sum;  
    }
}