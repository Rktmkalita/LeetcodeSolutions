class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0,n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        for(int i=k;i<n;i++){
            float avg = sum/k;
            if(avg>=threshold)
                count++;
            sum+=arr[i];
            sum-=arr[i-k];
        }
        if(sum/k>=threshold)
            return count+1;
        else 
            return count;
    }
}