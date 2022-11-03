class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l=0;
        int flag=1;
        int minLength = Arrays.asList(strs).stream()
            .sorted((e2, e1) -> e1.length() > e2.length() ? -1 : 1)
            .findFirst().get().length();
        while(l<minLength){
            for(int i=0;i<strs.length-1;i++){
                if(strs[i].charAt(l)!=strs[i+1].charAt(l)){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                l++;
            }else{
                break;
            }
        }
        if(l==0){
            return "";
        }else{
            return strs[0].substring(0,l);
        }
    }
}