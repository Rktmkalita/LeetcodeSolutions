class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int carry=1;
        for(int i=n-1;i>=0;i--){
            if(carry!=0){
                digits[i]+=carry;
                carry=digits[i]/10;
                digits[i]%=10;
            }else{
                return digits;
            }
        }
        if(carry==0){
            return digits;
        }else{
            int[] result = new int[n+1];
            result[0]=1;
            return result;
        }
        
    }
}