class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length())
            return new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        char ptempArray[] = p.toCharArray();
        Arrays.sort(ptempArray);
        String psort=new String(ptempArray);
        for(int i=0;i<=s.length()-p.length();i++){
            char stempArray[] = s.substring(i,p.length()+i).toCharArray();
            Arrays.sort(stempArray);
            String str=new String(stempArray);
            if(str.equals(psort)){
                list.add(i);
            }
        }
        return list;
    }
}