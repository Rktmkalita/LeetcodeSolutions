class Solution {
    public String getHint(String secret, String guess) {
        int bull=0,cow=0;
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:secret.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char[] guessArr = guess.toCharArray();
        for(int i=0;i<guess.length();i++){
            if(secret.charAt(i)==guessArr[i]){
                bull++;
                map.put(guessArr[i],map.get(guessArr[i])-1);
                guessArr[i]='X';
            }
        }
        for(int i=0;i<guess.length();i++){
            if(map.containsKey(guessArr[i]) && map.get(guessArr[i])>0){
                cow++;
                map.put(guessArr[i],map.get(guessArr[i])-1);
            }
        }
        return bull+"A"+cow+"B";
    }
}