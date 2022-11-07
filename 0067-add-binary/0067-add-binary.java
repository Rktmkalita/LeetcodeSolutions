class Solution {
    public String addBinary(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) {
                sum += s2.charAt(j) - '0';
                j--;
            }
            if (i >= 0) {
                sum += s1.charAt(i) - '0';
                i--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}