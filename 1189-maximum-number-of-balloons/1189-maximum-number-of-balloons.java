class Solution {
    public int maxNumberOfBalloons(String text) {
        if(text.length()<7)
            return 0;
        int[] counter = new int[26];
        for(char ch:text.toCharArray()){
            counter[ch-'a']++;
        }
        counter['l'-'a']/=2;
        counter['o'-'a']/=2;
        return Math.min(counter['l'-'a'],Math.min(counter['o'-'a'],Math.min(counter['b'-'a'],
                                                        Math.min(counter['a'-'a'],counter['n'-'a']))));
    }
}