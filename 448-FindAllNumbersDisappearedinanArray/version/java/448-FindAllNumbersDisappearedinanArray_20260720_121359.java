// Last updated: 20/07/2026, 12:13:59
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4        for (int val : nums) {
5            set.add(val);
6        }
7        ArrayList<Integer> list = new ArrayList<>();
8        for (int i = 1; i <= nums.length; i++) {
9            if (!set.contains(i)) {
10                list.add(i);
11            }
12        }
13        return list;
14    }
15}