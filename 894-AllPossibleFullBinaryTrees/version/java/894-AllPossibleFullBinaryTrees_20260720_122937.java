// Last updated: 20/07/2026, 12:29:37
1class Solution {
2
3    private Map<Integer, List<TreeNode>> dp = new HashMap<>();
4
5    public List<TreeNode> allPossibleFBT(int n) {
6        if (dp.containsKey(n)) {
7            return dp.get(n);
8        }
9
10        List<TreeNode> res = new ArrayList<>();
11        if (n == 1) {
12            res.add(new TreeNode(0));
13        } else if (n % 2 == 1) { // Full binary trees have an odd number of nodes
14            for (int i = 0; i < n; i++) {
15                int r = n - 1 - i;
16                List<TreeNode> leftTrees = allPossibleFBT(i);
17                List<TreeNode> rightTrees = allPossibleFBT(r);
18
19                for (TreeNode left : leftTrees) {
20                    for (TreeNode right : rightTrees) {
21                        TreeNode root = new TreeNode(0, left, right);
22                        res.add(root);
23                    }
24                }
25            }
26        }
27        dp.put(n, res);
28        return res;
29    }
30}
31
32
33//-------------------------------------------------------------------------------------------------------------------
34/*
35class Solution {
36    private Map<Integer, Integer> dp = new HashMap<>();
37
38    public int allPossibleFBT(int n) {
39        if (dp.containsKey(n)) {
40            return dp.get(n);
41        }
42
43        int count = 0;
44        if (n == 1) {
45            count = 1; // Single node tree
46        } else if (n % 2 == 1) { // Full binary trees have an odd number of nodes
47            for (int i = 0; i < n; i++) {
48                int r = n - 1 - i;
49                int leftCount = allPossibleFBT(i);
50                int rightCount = allPossibleFBT(r);
51                count += leftCount * rightCount;
52            }
53        }
54        dp.put(n, count);
55        return count;
56    }
57}
58 Above is count the no of FBT
59
60*/