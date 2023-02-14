class Solution {
    public String defangIPaddr(String address) {
        String[] str = address.split("\\.");
        return str[0]+"[.]"+str[1]+"[.]"+str[2]+"[.]"+str[3];
    }
}