// Last updated: 14/08/2026, 10:10:56
1class Solution {
2    public int[] getSneakyNumbers(int[] nums) {
3        int[] ans = new int[2]; 
4        int count = 0; 
5
6        for (int i = 0; i < nums.length; i++) {
7            for (int j = i + 1; j < nums.length; j++) {
8                if (nums[i] == nums[j]) {
9                    ans[count++] = nums[i]; 
10                }
11            }
12        }
13        return ans;
14    }
15}