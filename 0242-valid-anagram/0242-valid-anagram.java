class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] sarr = s.toCharArray();
        Arrays.sort(sarr);
        char[] tarr = t.toCharArray();
        Arrays.sort(tarr);
        String str1=new String(sarr);
        String str2=new String(tarr);
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}