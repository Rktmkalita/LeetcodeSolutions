class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new LinkedList<>();
        if(p.length()>s.length())
            return list;
        int[] pcount=new int[26];
        for(char ch:p.toCharArray()){
            pcount[ch-'a']++;
        }
        for(int i=0;i<=s.length()-p.length();i++){
            int[] scount=new int[26];
            boolean flag=true;
            for(char ch:s.substring(i,p.length()+i).toCharArray()){
                scount[ch-'a']++;
            }
            for(int j=0;j<26;j++){
                if(scount[j]!=pcount[j]){
                    flag=false;
                    break;
                }
            }
            if(flag==true)
                list.add(i);
        }
        return list;
    }
}