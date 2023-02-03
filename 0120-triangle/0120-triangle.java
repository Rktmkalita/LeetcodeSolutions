class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                int min=Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1));
                int sum=min+triangle.get(i).get(j);
                triangle.get(i).set(j,sum);
            }
        }
        return triangle.get(0).get(0);
        // return helper(triangle,0,0,1);
    }
//     public int helper(List<List<Integer>> triangle, int listNo, int l, int r){
//         if(listNo>=triangle.size())
//             return 0;
//         if(l<0){
//             return triangle.get(listNo).get(r)+helper(triangle,listNo+1,r,r+1);
//         }
//         if(r>=triangle.get(listNo).size()){
//             return triangle.get(listNo).get(l)+helper(triangle,listNo+1,l,l+1);
//         }
        
//         return Math.min(triangle.get(listNo).get(l)+helper(triangle,listNo+1,l,l+1),triangle.get(listNo).get(r)+helper(triangle,listNo+1,r,r+1));
//     }
}