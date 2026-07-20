// Last updated: 20/07/2026, 12:30:57
1class Solution {
2    public int numTilings(int n) {
3        if(n <= 2)
4            return n;
5        
6        int mod = 1_000_000_007;
7        long[] fullTiling = new long[n+1];
8        long[] partTiling = new long[n+1];
9        
10        // One tile vertical can fill a pair of cells (or 1 column)
11        fullTiling[1] = 1;
12        // 2 vertical and 2 horizontals can fill up 2 pair of cells (or 2 columns)
13        fullTiling[2] = 2; 
14        
15        // Cannot fill one cell (in a column) with either domino or tromino
16        partTiling[1] = 0; 
17        // If 1 cell out of 4 (2 pair of cells) is already filled then a tromino can fill the remaining 3 cells
18        partTiling[2] = 1; 
19        
20        for(int i=3; i <= n; i++){
21            fullTiling[i] = (fullTiling[i-1] + fullTiling[i-2] + 2 * partTiling[i-1]) % mod;
22            partTiling[i] = (partTiling[i-1] + fullTiling[i-2]) % mod;
23        }        
24        return (int)(fullTiling[n]);
25    }
26}