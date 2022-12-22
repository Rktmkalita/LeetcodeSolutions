class Solution {
    public String intToRoman(int num) {
        StringBuilder str= new StringBuilder();
        if(num>=1000){
            int count=num/1000;
            while(count-->0){
                str.append("M");
            }
            num=num%1000;
        }
        if(num>=500){
            int count=(num/100)-5;
            if(count==4){
                str.append("CM");
            }else{
                str.append("D");
                while(count-->0){
                    str.append("C");
                }
            }
            num=num%100;
        }
        if(num>=100){
            int count=(num/100);
            if(count==4){
                str.append("CD");
            }else{
                while(count-->0){
                    str.append("C");
                }
            }
            num=num%100;
        }
        if(num>=50){
            int count=(num/10)-5;
            if(count==4){
                str.append("XC");
            }else{
                str.append("L");
                while(count-->0){
                    str.append("X");
                }
            }
            num=num%10;
        }
        if(num>=10){
            int count=(num/10);
            if(count==4){
                str.append("XL");
            }else{
                while(count-->0){
                    str.append("X");
                }
            }
            num=num%10;
        }
        if(num>=5){
            int count=num-5;
            if(count==4){
                str.append("IX");
            }else{
                str.append("V");
                while(count-->0){
                    str.append("I");
                }
            }
            return str.toString();
        }
        if(num==4){
            str.append("IV");
        }else{
            while(num-->0){
                str.append("I");
            }
        }
        return str.toString();
    }
}