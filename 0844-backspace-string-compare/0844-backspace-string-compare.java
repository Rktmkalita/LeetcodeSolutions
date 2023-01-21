class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();

        for (char charac : s.toCharArray()) {
            if (charac != '#') stack1.push(charac);
            else if (!stack1.isEmpty()) stack1.pop();
        }

        for (char charac : t.toCharArray()) {
            if (charac != '#') stack2.push(charac);
            else if (!stack2.isEmpty()) stack2.pop();
        }

        return stack1.equals(stack2);
    }
}