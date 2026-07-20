// Last updated: 20/07/2026, 11:48:00
1class Solution {
2    public boolean isInterleave(final String s1, final String s2, final String s3) {
3        if(s1.length() + s2.length() != s3.length())
4            return false;
5
6        return dfs(s1, s2, s3, 0, 0, 0, new boolean[s1.length() + 1][s2.length() + 1]);
7    }
8
9    public boolean dfs(final String s1, final String s2, final String s3, final int i, final int j, final int k, final boolean[][] invalid) {
10        if(k == s3.length())
11            return true;
12
13        if(invalid[i][j])
14            return false;
15
16        final boolean valid = i < s1.length() && s1.charAt(i) == s3.charAt(k) && dfs(s1, s2, s3, i + 1, j, k + 1, invalid) ||
17                            j < s2.length() && s2.charAt(j) == s3.charAt(k) && dfs(s1, s2, s3, i, j + 1, k + 1, invalid);
18
19        if(!valid)
20            invalid[i][j] = true;
21
22        return valid;
23    }
24}