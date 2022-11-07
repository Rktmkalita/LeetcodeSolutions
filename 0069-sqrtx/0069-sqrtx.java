class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        
        long left=1,right=x;
        
        while(left<right){
            long mid=left+(right-left)/2;
            if(mid*mid>x){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        int result=(int)left-1;
        return result;

    }
}