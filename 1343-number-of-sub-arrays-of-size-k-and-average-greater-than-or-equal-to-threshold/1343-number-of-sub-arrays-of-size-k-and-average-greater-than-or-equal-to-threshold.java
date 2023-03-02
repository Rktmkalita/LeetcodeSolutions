class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0,n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if((float)sum/k>=threshold)
            count++;
        for(int i=k;i<n;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            float avg = (float)(sum)/k;
            if(avg>=threshold)
                count++;
        }
        return count;
    }
}