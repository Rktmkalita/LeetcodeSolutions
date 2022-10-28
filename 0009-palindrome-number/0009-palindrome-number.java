class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        StringBuilder input1 = new StringBuilder();
        if(num.equals(input1.append(num).reverse().toString()))
            return true;
        return false;
    }
}