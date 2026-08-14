// Last updated: 14/08/2026, 10:12:12
1
2class Solution {
3    public long kthLargestLevelSum(TreeNode root, int k) {
4        if(root==null) return -1;
5
6        Queue<TreeNode> q = new LinkedList<>();
7        PriorityQueue<Long> pq = new PriorityQueue<>(); // this is a minHeap
8
9        q.add(root);
10        while(!q.isEmpty()){
11            int size = q.size();
12            long sum = 0;
13            for(int i=0;i<size;i++){
14                TreeNode curr = q.poll();
15                sum += curr.val;
16                if(curr.left!=null) q.add(curr.left); 
17                if(curr.right!=null) q.add(curr.right); 
18            }
19            pq.add(sum);
20            while(pq.size()>k) pq.poll();
21        }
22        return (pq.size()<k) ? -1 : pq.peek();
23    }
24}