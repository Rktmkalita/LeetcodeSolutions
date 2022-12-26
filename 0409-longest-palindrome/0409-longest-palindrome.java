class Solution {
    public int longestPalindrome(String s) {
        int arr[]=new int[256];
        int count=0,i=0;
        while(i<s.length()){
            arr[s.charAt(i++)]++;
        }
        for(i=0;i<256;i++){
            arr[i]=arr[i]/2;
            if(arr[i]!=0){
                count+=arr[i]*2;
            }
        }
        if(s.length()-count!=0){
            return count+1;
        }else{
            return count;
        }
    }
}