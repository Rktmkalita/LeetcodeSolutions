class Solution {
    public boolean backspaceCompare(String s, String t) {
        return helper(s).equals(helper(t));
    }
    private Stack<Character> helper(String s){
        Stack<Character> stack = new Stack<Character>();
        for (char ch : s.toCharArray()) {
            if (ch != '#') 
                stack.push(ch);
            else if (!stack.isEmpty()) 
                stack.pop();
        }
        return stack;
    }
}