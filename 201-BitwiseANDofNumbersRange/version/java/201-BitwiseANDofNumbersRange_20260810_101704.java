// Last updated: 10/08/2026, 10:17:04
1class Solution {
2    public int countTriplets(int[] arr) {
3        int count = 0;
4        int n = arr.length;
5        
6        for (int i = 0; i < n; i++) {
7            for (int j = i + 1; j < n; j++) {
8                int a = 0;
9                for (int k = i; k < j; k++) {
10                    a ^= arr[k];
11                }
12                
13                int b = 0;
14                for (int k = j; k < n; k++) {
15                    b ^= arr[k];
16                    if (a == b) {
17                        count++;
18                    }
19                }
20            }
21        }
22        
23        return count;
24    }
25}