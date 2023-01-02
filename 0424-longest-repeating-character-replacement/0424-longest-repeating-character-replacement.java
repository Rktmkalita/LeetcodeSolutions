class Solution {
    public int characterReplacement(String s, int k) {
        int start=0;
        int maxcount=0;
        int ans=0;
        int c[]=new int[26];
        int n=s.length();
        for(int end=0;end<n;end++)
        {
            c[s.charAt(end)-'A']++;
            maxcount=Math.max(maxcount,c[s.charAt(end)-'A']);
            while(end-start-maxcount>k-1)
            {
                c[s.charAt(start++)-'A']--;
            }
            ans=Math.max(ans,end-start+1);
        }
        return ans;
    }
}