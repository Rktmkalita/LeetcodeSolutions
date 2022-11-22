class Solution {
    
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
            double C = 1;
            for (int i = 0; i <= rowIndex; i++) {
                list.add((int)C);
                C = C * (rowIndex - i) / (i+1);
            }
        return list;
    }
}