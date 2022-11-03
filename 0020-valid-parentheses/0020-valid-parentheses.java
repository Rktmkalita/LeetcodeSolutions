class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            switch(ch){
                case '(':
                    stack.push(ch);
                    break;
                case '{':
                    stack.push(ch);
                    break;
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.empty()){
                        return false;
                    }
                    if(stack.peek()=='('){
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                case '}':
                    if(stack.empty()){
                        return false;
                    }
                    if(stack.peek()=='{'){
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                case ']':
                    if(stack.empty()){
                        return false;
                    }
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