// Last updated: 20/07/2026, 12:25:21
1class Solution {
2    public int findShortestSubArray(int[] nums) {
3        Map<Integer, Integer> mp = new HashMap<>();
4        for (int x : nums)
5            mp.put(x, mp.getOrDefault(x, 0) + 1);
6
7        int f = 0;
8        for (int freq : mp.values())
9            f = Math.max(f, freq);
10
11        int ans = Integer.MAX_VALUE;
12        for (int key : mp.keySet()) {
13            if (mp.get(key) == f) {
14                int l = 0, r = nums.length - 1;
15                while (l <= r) {
16                    if (nums[l] == key) break;
17                    l++;
18                }
19                while (l < r) {
20                    if (nums[r] == key) break;
21                    r--;
22                }
23                ans = Math.min(ans, r - l + 1);
24            }
25        }
26
27        return ans;
28    }
29}