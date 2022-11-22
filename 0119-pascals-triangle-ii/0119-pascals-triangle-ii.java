class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row1 = new ArrayList<Integer>();
        row1.add(1);
        res.add(row1);
        
        List<Integer> currentRow;
        for(int i=2; i <= rowIndex+1; i++) {
            currentRow = new ArrayList<Integer>();
            for(int j=0; j < i; j++) {
                if(j == 0 || j == (i-1)) {
                    currentRow.add(1);
                }
                else {
                    currentRow.add(
                        res.get(i-2).get(j-1)
                        + res.get(i-2).get(j)
                    );
                }
            }
            res.add(currentRow);
        }
        return res.get(rowIndex);
    }
}