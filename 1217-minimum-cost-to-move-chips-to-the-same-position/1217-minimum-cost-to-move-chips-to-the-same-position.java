class Solution {
    public int minCostToMoveChips(int[] position) {
        int countE=0,countO=0;
        for(int num:position){
            if(num%2==0)
                countE++;
            else
                countO++;
        }
        return Math.min(countO,countE);
    }
}