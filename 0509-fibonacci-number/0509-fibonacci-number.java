class Solution {
    public int fib(int n) {
        if(n==0)
            return 0;
        int a=0,b=1;
        int c=a+b;
        for(int i=3;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
        }
        return c;
    }
}