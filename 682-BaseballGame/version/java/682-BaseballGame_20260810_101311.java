// Last updated: 10/08/2026, 10:13:11
1class Solution {
2    public int calPoints(String[] ops) {
3        Stack<Integer> stack = new Stack();
4        int ans = 0;
5
6        for(String op : ops) {
7            if (op.equals("+")) {
8                int top = stack.pop();
9                int newtop = top + stack.peek();
10                stack.push(top);
11                stack.push(newtop);
12            } else if (op.equals("C")) {
13                ans -= stack.pop();
14                continue;
15            } else if (op.equals("D")) {
16                stack.push(2 * stack.peek());
17            } else {
18                stack.push(Integer.valueOf(op));
19            }
20            ans += stack.peek();
21        }
22        return ans;
23    }
24}