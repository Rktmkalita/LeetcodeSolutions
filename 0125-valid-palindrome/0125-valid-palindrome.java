class Solution {
    public boolean isPalindrome(String s) {
        // char[] ch = s.toLowerCase().toCharArray();
        // int i=0,j=s.length()-1;
        // while(true){
        //     if(!(Character.isDigit(ch[i]) || (ch[i]>='a' && ch[i]<='z'))){
        //         i++;
        //         if(i>=j){
        //             System.out.println("returning false");
        //             return false;
        //         }
        //         System.out.println("1 "+ch[i]+" "+ch[j]);
        //     }else if(!(Character.isDigit(ch[i]) || (ch[j]>='a' && ch[j]<='z'))){
        //         j--;
        //         if(i>=j){
        //             System.out.println("returning false");
        //             return false;
        //         }
        //         System.out.println("2 "+ch[i]+" "+ch[j]);
        //     }else{
        //         if(ch[i]!=ch[j]){
        //             System.out.println("false "+ch[i]+" "+ch[j]);
        //             return false;
        //         }else{
        //             System.out.println("true "+ch[i]+" "+ch[j]);
        //             i++;
        //             j--;
        //         }
        //     }
        // }
        s=s.toLowerCase();
        char[] ch = new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || (s.charAt(i)>='a' && s.charAt(i)<='z')){
                ch[j]=s.charAt(i);
                j++;
            }
        }
        // String str = String.copyValueOf(ch);
        // System.out.println(str);
        int i=0;
        j--;
        while(i<j){
            if(ch[i]!=ch[j]){
                // System.out.println("false "+ch[i]+" "+ch[j]);
                return false;
            }else{
                // System.out.println("true "+ch[i]+" "+ch[j]);
                i++;
                j--;
            }
        }
        return true;
    }
}