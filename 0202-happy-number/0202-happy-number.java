class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while(n!=1){
            int sum=0;
            while(n>0){
                sum+=Math.pow(n%10,2);
                n/=10;
            }
            n=sum;
            if(set.contains(n))
                return false;
            set.add(sum);
        }
        return true;
    }
}