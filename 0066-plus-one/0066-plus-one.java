class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int carry=1;
        // digits[n-1]++;
        // if(digits[n-1]<=9){
        //     return digits;
        // }
        // carry=digits[n-1]/10;
        // digits[n-1]%=10;
        for(int i=n-1;i>=0;i--){
            if(carry!=0){
                digits[i]=digits[i]+carry;
                carry=digits[i]/10;
                digits[i]=digits[i]%10;
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