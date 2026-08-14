// Last updated: 14/08/2026, 10:08:29
1class Solution {
2public:
3const int MOD=1e9+7;
4    long long combination(long long a, long long b)
5    {
6        if(b>a)return 0;
7        long long n=1,d=1;
8        for(long long i=0;i<b;++i)
9        {
10            n=n*(a-i)%MOD;
11            d=d*(i+1)%MOD;
12        }
13       // fermats little theorem
14        long long n_inv=1, exp=MOD-2;
15        while(exp)
16        {
17            if(exp%2)n_inv=n_inv*d%MOD;
18            d=d*d%MOD;
19            exp/=2;
20        }
21        return n*n_inv%MOD;
22    }
23    int distanceSum(int m, int n, int k) {
24        long long base = combination(m*n-2, k-2), res=0;
25        for( int i=1; i<n;++i)
26        {
27            res = (res+1LL*i*(n-i)%MOD*m%MOD*m%MOD)%MOD;
28        }
29        for( int i=1; i<m;++i)
30        {
31            res = (res+1LL*i*(m-i)%MOD*n%MOD*n%MOD)%MOD;
32        }
33        return res*base%MOD;
34    }
35};