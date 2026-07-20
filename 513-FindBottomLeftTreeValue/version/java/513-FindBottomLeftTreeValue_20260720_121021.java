// Last updated: 20/07/2026, 12:10:21
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
17    public int findBottomLeftValue(TreeNode root) {
18        List<List<Integer>> li=levelOrder(root);
19        return li.get(li.size()-1).get(0);
20        
21    }
22    public List<List<Integer>> levelOrder(TreeNode root) {
23        List<List<Integer>> al=new ArrayList<>();
24        if(root==null){
25            return al;
26        }
27        Queue<TreeNode> q=new LinkedList<>();
28        q.add(root);
29        while(!q.isEmpty()){
30            int n=q.size();
31            ArrayList<Integer> li=new ArrayList<>();
32            for(int i=0;i<n;i++){
33                TreeNode curr=q.poll();
34                li.add(curr.val);
35                if(curr.left!=null){
36                    q.add(curr.left);
37                }
38                 if(curr.right!=null){
39                    q.add(curr.right);
40                }
41            }
42            al.add(li);
43        }
44        return al;
45    }
46}