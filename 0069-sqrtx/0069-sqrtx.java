class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
            
        double temp, squareroot;
		
		squareroot = x / 2;
		
		do {
			temp = squareroot;
			squareroot = (temp + (x / temp))/2;
		} while((temp - squareroot) != 0);
        
        return (int)squareroot;
    }
}