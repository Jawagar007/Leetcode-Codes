// Last updated: 10/08/2026, 10:22:42
1class Solution {
2    public int maxSumAfterPartitioning(int[] arr, int k) {
3        int n = arr.length;
4        int dp[]=new int[n+1];
5        for(int idx=n-1;idx>=0;idx--)
6            {
7                int maxi=0;
8                int sum=0;
9                int maxAns=0;
10                int len=0;
11                for(int j=idx;j<Math.min(n,idx+k);j++)
12                    {
13                        len++;
14                        maxi=Math.max(maxi,arr[j]);
15                        sum=maxi*len+dp[j+1];
16                        maxAns=Math.max(sum,maxAns);
17                    }
18                dp[idx]=maxAns;
19            }
20        return dp[0];
21    }
22}