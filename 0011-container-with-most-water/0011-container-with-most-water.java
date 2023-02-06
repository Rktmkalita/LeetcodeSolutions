class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int max=0;
        int left=0,right=height.length-1;
        while(left<right){
            area=Math.min(height[left],height[right])*(right-left);
            if(area>max){
                max=area;
            }
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}