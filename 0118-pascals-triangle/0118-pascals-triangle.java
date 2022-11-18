class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int line = 1; line <= numRows; line++) {
            List<Integer> list = new ArrayList<>();
            int C = 1;
            for (int i = 1; i <= line; i++) {
                list.add(C);
                C = C * (line - i) / i;
            }
            triangle.add(list);
        }
        return triangle;
    }
}