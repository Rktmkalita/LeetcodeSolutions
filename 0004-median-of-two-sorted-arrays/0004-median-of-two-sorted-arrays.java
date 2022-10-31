class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int len=m+n;
        int[] result = new int[m+n];
        int j=0,k=0;
        int i=0;
        while(j<m && k<n){
            if(nums1[j]<nums2[k]){
                result[i]=nums1[j];
                i++;
                j++;
            } else{
                result[i]=nums2[k];
                i++;
                k++;
            }
        }
        while(j<m){
            result[i]=nums1[j];
            j++;
            i++;
        }
        while(k<n){
            result[i]=nums2[k];
            k++;
            i++;
        }
        
        if(len%2!=0){
            return result[len/2];
        }else{
            return (double)(result[len/2]+result[len/2-1])/2;
        }
        
    }
}