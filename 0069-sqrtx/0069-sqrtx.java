class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
            
        double temp, sqrroot;
		
		sqrroot = x / 2;
		
		do {
			temp = sqrroot;
			sqrroot = (temp + (x / temp))/2;
		} while((temp - sqrroot) != 0);
        
        return (int)sqrroot;
    }
}