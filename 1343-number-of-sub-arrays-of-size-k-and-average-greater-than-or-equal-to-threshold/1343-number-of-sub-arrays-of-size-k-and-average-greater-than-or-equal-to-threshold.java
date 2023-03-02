class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0,n=arr.length;
        int[] sumarr = new int[n];
        sumarr[0]=arr[0];
        for(int i=1;i<n;i++){
            sumarr[i]=sumarr[i-1]+arr[i];
        }
        if((float)sumarr[k-1]/k>=threshold)
            count++;
        for(int i=k;i<n;i++){
            float avg = (float)(sumarr[i]-sumarr[i-k])/k;
            if(avg>=threshold)
                count++;
        }
        return count;
    }
}