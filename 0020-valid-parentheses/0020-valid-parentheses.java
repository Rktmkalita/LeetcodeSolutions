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
                    if(stack.empty() || stack.pop()!='('){
                        return false;
                    }
                    break;
                case '}':
                    if(stack.empty() || stack.pop()!='{'){
                        return false;
                    }
                    break;
                case ']':
                    if(stack.empty() || stack.pop()!='['){
                        return false;
                    }
                    break;
            }
        }
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
}