class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch =='['){
                stack.push(ch);
            }else if(stack.empty()){
                return false;
            }
            switch(ch){
                case ')':
                    if(stack.peek()=='('){
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                case '}':
                    if(stack.peek()=='{'){
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                case ']':
                    if(stack.peek()=='['){
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}