class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new LinkedList<>();
        if(s.length() < p.length()){
            return result;
        }
        
        int left = 0;
        int right = p.length() - 1;

        int[] count = new int[26]; // hashmap: char to count
        
        for(char ch: p.toCharArray()){
            int index = ch - 'a';
            count[index]--;
        }

        for(int i=left; i<=right; i++){
            char ch = s.charAt(i);
            int index = ch - 'a';
            count[index]++;
        }

        boolean good = true;

        for(int value: count){
            if(value != 0){
                good = false;
                break;
            }
        }

        if(good){
            result.add(left);
        }
       
        while(right < s.length() - 1){
            left++;
            right++;
            
            char charOld = s.charAt(left-1);
            char charNew = s.charAt(right);
            
            count[charOld - 'a']--;                  
            count[charNew - 'a']++;

            good = true;

            for(int value: count){
                if(value != 0){
                    good = false;
                    break;
                }
            }
        
            if(good){
                result.add(left);
            }
        }

        return result;
    }
}