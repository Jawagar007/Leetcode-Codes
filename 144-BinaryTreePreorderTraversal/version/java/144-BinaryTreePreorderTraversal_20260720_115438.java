// Last updated: 20/07/2026, 11:54:38
1
2/**
3 * Definition for a binary tree node.
4 * public class TreeNode {
5 *     int val;
6 *     TreeNode left;
7 *     TreeNode right;
8 *     TreeNode() {}
9 *     TreeNode(int val) { this.val = val; }
10 *     TreeNode(int val, TreeNode left, TreeNode right) {
11 *         this.val = val;
12 *         this.left = left;
13 *         this.right = right;
14 *     }
15 * }
16 */
17class Solution {
18    public List<Integer> preorderTraversal(TreeNode root) {
19        List<Integer>list=new ArrayList<>();
20        helper(root,list);
21        return list;
22    }
23    public void helper(TreeNode node,List<Integer>list){
24        if(node==null)return;
25        list.add(node.val);
26        helper(node.left,list);
27        helper(node.right,list);
28    }
29}
30