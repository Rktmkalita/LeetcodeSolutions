class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0,k=0;
        int[] arr=new int[m+n];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        int i=0;
        while(i<m || j<n){
            if(i==m){
                nums1[k]=nums2[j];
                k++;
                j++;
            }else if(j==n){
                nums1[k]=arr[i];
                k++;
                i++;
            }else if(arr[i]<nums2[j]){
                nums1[k]=arr[i];
                k++;
                i++;
            }else{
                nums1[k]=nums2[j];
                k++;
                j++;
            }
        } 
    }
}