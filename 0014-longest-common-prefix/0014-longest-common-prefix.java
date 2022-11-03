class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int l=0;
        int flag=1;       
        int minLength = strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(minLength>strs[i].length()){
                minLength=strs[i].length();
            }
        }
        
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