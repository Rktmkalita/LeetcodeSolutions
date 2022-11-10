class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] arr=new int[m+n];
        while(i<m || j<n){
            if(i==m){
                arr[k]=nums2[j];
                k++;
                j++;
            }else if(j==n){
                arr[k]=nums1[i];
                k++;
                i++;
            }else if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                k++;
                i++;
            }else{
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }
        for(int ai=0;ai<m+n;ai++){
            nums1[ai]=arr[ai];
        }
        
    }
}