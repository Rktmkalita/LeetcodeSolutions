class Solution {
    public int climbStairs(int n) {
        
        if(n<=2){
            return n;
        }
        int steps=0,a=1,b=2;
        for(int i=3;i<=n;i++){
            steps=a+b;
            a=b;
            b=steps;
        }
        return steps;
    }
    
}