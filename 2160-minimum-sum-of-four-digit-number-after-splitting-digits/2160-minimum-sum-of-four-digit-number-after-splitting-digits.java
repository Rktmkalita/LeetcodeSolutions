class Solution {
    public int minimumSum(int num) {
        int temp[] = new int[4];
        int i=0;
        while(num>0){
            temp[i]=num%10;
            num/=10;
            i++;
        }
        Arrays.sort(temp);
        return temp[0]*10+temp[2]+temp[1]*10+temp[3];
    }
}