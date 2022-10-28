class Solution {
    public int romanToInt(String s) {
        int num=0;
        char c = s.charAt(0);

        switch(c){
            case 'I':
                num+=1;
                break;
            case 'V':
                num+=5;
                break;
            case 'X':
                num+=10;
                break;
            case 'L':
                num+=50;
                break;
            case 'C':
                num+=100;
                break;
            case 'D':
                num+=500;
                break;
            case 'M':
                num+=1000;
                break;
        }
        
        for(int i=1;i<s.length();i++){
            switch(s.charAt(i)) {
                case 'M':
                    num+=1000;
                    if(c=='C'){
                        num-=200;
                    }
                    break;
                case 'D':
                    num+=500;
                    if(c=='C'){
                        num-=200;
                    }
                    break;
                case 'C':
                    num+=100;
                    if(c=='X'){
                        num-=20;
                    }
                    break;
                case 'L':
                    num+=50;
                    if(c=='X'){
                        num-=20;
                    }
                    break;
                case 'X':
                    num+=10;
                    if(c=='I'){
                        num-=2;
                    }
                    break;
                case 'V':
                    num+=5;
                    if(c=='I'){
                        num-=2;
                    }
                    break;
                case 'I':
                    num++;
                    break;
            }
            c = s.charAt(i);
        }
        return num;
    }
}