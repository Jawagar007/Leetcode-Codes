// Last updated: 04/02/2026, 22:44:41
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        // Use long to handle unsigned values
        long n = num & 0xFFFFFFFFL;
        StringBuilder sb = new StringBuilder();
        
        char[] hexChars = "0123456789abcdef".toCharArray();
        
        while (n != 0) {
            int digit = (int)(n & 0xF); // last 4 bits
            sb.append(hexChars[digit]);
            n >>= 4; // shift right by 4 bits
        }
        
        return sb.reverse().toString();
    }
}