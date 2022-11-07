class Solution {
    public int mySqrt(int x) {
        // int i=0;
        // return i-1;
        // while(i*i<=x){
        //     if(i*i==x)
        //         return i;
        //     i++;
        // }
        // return i-1;
        // if(x<2){
        //     return x;
        // }
        // int left=1,right=x;
        // int mid=0;
        // while(left<=right){
        //     mid=(left+right)/2;
        //     if(mid*mid==x){
        //         return mid;
        //     }else if(mid*mid>x){
        //         // if((mid-1)*(mid-1)>x){
        //         //     return mid;
        //         // }
        //         right=mid-1;
        //     }else{
        //         // if((mid+1)*(mid+1)>x){
        //         //     return mid;
        //         // }
        //         left=mid+1;
        //     }
        // }
        // return mid;
        
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