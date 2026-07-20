// Last updated: 20/07/2026, 12:01:56
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> s1 = new HashSet<>();
4        HashSet<Integer> s2 = new HashSet<>();
5
6        for(int i : nums1)
7        {
8            s1.add(i);
9        }
10        for(int i : nums2){
11            if(s1.contains(i)) s2.add(i);
12        }
13
14        int[] res = new int[s2.size()];
15        int i = 0;
16        for(int n : s2)
17        {
18            res[i++] = n;
19        }
20        return res;
21    }
22}