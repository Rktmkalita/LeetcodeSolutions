class Solution {
    public int minimumSum(int num) {
        int temp[] = new int[4];
        for(int i=0;num>0;i++){
            temp[i]=num%10;
            num/=10;
        }
        Arrays.sort(temp);
        return temp[0]*10+temp[2]+temp[1]*10+temp[3];
    }
}