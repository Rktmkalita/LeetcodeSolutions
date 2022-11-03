class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char ch : s.toCharArray()){
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
        if(stack.empty()){
            return true;
        }
        return false;
    }
}