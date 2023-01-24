class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int firstElement = 0;
        int lastElement = nums.length - 1;
        int restOfElements = k - 1;
        reverse(nums, 0, lastElement, k);
        reverse(nums, 0, restOfElements, k);
        reverse(nums, k, lastElement, k);
    }
    public void reverse(int[] nums, int start, int end, int k) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
    }
}