class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(String str : sentences){
            count = Math.max(str.split("\\s+").length,count);
        }
        return count;
    }
}