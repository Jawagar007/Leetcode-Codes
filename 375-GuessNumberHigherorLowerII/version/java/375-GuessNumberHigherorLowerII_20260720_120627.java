// Last updated: 20/07/2026, 12:06:27
1class Solution {
2    public int getMoneyAmount(int n) {
3        int[][] dp = new int[n + 1][n + 1];
4        
5        for (int i = n - 1; i >= 1; --i) {
6            for (int j = i + 1; j <= n; ++j) {
7                dp[i][j] = Integer.MAX_VALUE;
8                // start x from mid because of the observation that the above observations
9                int start = i + (j - i) / 2;
10                int end = start + 1;
11                for (int x = start; x <= j; ++x) {
12                    int right = 0;
13                    int left = 0;
14                    if (x + 1 <= n) {
15                        right = dp[x + 1][j];
16                    }
17                    if (x - 1 >= 0) {
18                        left = dp[i][x - 1];
19                    }
20                    dp[i][j] = Math.min(dp[i][j], x + Math.max(left, right));
21                }
22            }
23        }
24        
25        return dp[1][n];
26    }
27}