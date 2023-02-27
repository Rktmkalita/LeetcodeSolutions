class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) 
        {
            if (nums[i] <= nums[i - 1])
            {
                // Check if nums[i] is not greater than the previous element
                count++;
                // Increment the count of elements that are not strictly increasing
                if (count > 1) 
                {
                    // If more than one element needs to be removed, return false
                    return false;
                }
                
                nums[i] = (i > 1 && nums[i] <= nums[i - 2]) ? nums[i - 1] : nums[i];
            }
        }
        return true;
    }
}