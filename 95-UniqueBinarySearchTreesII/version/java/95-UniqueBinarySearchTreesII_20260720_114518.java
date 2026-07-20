// Last updated: 20/07/2026, 11:45:18
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<TreeNode> generateTrees(int n) {
18        if (n == 0) {
19            return new ArrayList<>();
20        }
21        return helperGenerateTrees(1, n);
22    }
23
24    private List<TreeNode> helperGenerateTrees(int start, int end) {
25        List<TreeNode> allTrees = new ArrayList<>();
26
27        if (start > end) {
28            allTrees.add(null);
29            return allTrees;
30        }
31
32        for (int rootVal = start; rootVal <= end; rootVal += 1) {
33
34            List<TreeNode> leftTrees =  helperGenerateTrees(start, rootVal - 1);
35            List<TreeNode> rightTrees = helperGenerateTrees(rootVal + 1, end);
36
37            for (TreeNode leftTree : leftTrees) {
38                for (TreeNode rightTree: rightTrees) {
39                    TreeNode root = new TreeNode(rootVal);
40                    root.left = leftTree;
41                    root.right = rightTree;
42                    allTrees.add(root);
43                }
44            }
45        }
46        return allTrees;
47    }
48}