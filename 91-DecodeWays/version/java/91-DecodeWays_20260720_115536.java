// Last updated: 20/07/2026, 11:55:36
1public class Solution {
2    public int numDecodings(String s) {
3        int n = s.length();
4        if (n == 0) return 0;
5        
6        int[] memo = new int[n+1];
7        memo[n]  = 1;
8        memo[n-1] = s.charAt(n-1) != '0' ? 1 : 0;
9        
10        for (int i = n - 2; i >= 0; i--)
11            if (s.charAt(i) == '0') continue;
12            else memo[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? memo[i+1]+memo[i+2] : memo[i+1];
13        
14        return memo[0];
15    }
16}