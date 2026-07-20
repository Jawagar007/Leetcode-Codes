// Last updated: 20/07/2026, 12:32:24
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
17    int minabs=Integer.MAX_VALUE;
18    TreeNode prev=null;
19    public void dfs(TreeNode root){
20        if(root==null) return;
21        dfs(root.left);
22        if(prev!=null) minabs=Math.min(minabs,root.val-prev.val);
23        prev=root;
24        dfs(root.right);
25    }
26    public int minDiffInBST(TreeNode root) {
27        dfs(root);
28        return minabs;
29    }
30}