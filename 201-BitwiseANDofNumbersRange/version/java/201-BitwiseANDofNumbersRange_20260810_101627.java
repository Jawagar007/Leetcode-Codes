// Last updated: 10/08/2026, 10:16:27
1class Solution {
2    public int rangeBitwiseAnd(int left, int right) {
3        int res = right;
4        while(right > left) {
5            res = right & (right-1);
6            right = res;
7        }
8        return res;
9        
10    }
11}