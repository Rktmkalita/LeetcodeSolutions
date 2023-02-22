class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int dif = s.lastIndexOf(ch)-i;
            if(dif==0)
                continue;
            if(dif!=distance[ch-'a']+1)
                return false;
        }
        return true;
    }
}