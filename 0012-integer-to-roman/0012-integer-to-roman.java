class Solution {
    public String intToRoman(int num) {
        String str="";
        if(num>=1000){
            int count=num/1000;
            for(int i=0;i<count;i++){
                str+="M";
            }
            num=num%1000;
        }
        if(num>=500){
            int count=(num/100)-5;
            if(count==4){
                str+="CM";
            }else{
                str+="D";
                for(int i=0;i<count;i++){
                    str+="C";
                }
            }
            num=num%100;
        }
        if(num>=100){
            int count=(num/100);
            if(count==4){
                str+="CD";
            }else{
                for(int i=0;i<count;i++){
                    str+="C";
                }
            }
            num=num%100;
        }
        if(num>=50){
            int count=(num/10)-5;
            if(count==4){
                str+="XC";
            }else{
                str+="L";
                for(int i=0;i<count;i++){
                    str+="X";
                }
            }
            num=num%10;
        }
        if(num>=10){
            int count=(num/10);
            if(count==4){
                str+="XL";
            }else{
                for(int i=0;i<count;i++){
                    str+="X";
                }
            }
            num=num%10;
        }
        if(num>=5){
            int count=num-5;
            if(count==4){
                str+="IX";
            }else{
                str+="V";
                for(int i=0;i<count;i++){
                    str+="I";
                }
            }
            return str;
        }
        if(num==4){
            str+="IV";
        }else{
            for(int i=0;i<num;i++){
                str+="I";
            }
        }
        return str;
    }
}