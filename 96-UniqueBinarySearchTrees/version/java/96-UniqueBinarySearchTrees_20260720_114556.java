// Last updated: 20/07/2026, 11:45:56
1public class Solution {
2    public int numTrees(int n) {
3        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
4        map.put(0,1);
5        map.put(1,1);
6        return numTrees(n, map);
7    }
8    
9    private int numTrees(int n, Map<Integer, Integer> map){
10        // check memory
11        if(map.containsKey(n)) return map.get(n);
12        // recursion
13        int sum = 0;
14        for(int i = 1;i <= n;i++)
15            sum += numTrees(i-1, map) * numTrees(n-i, map);
16        map.put(n, sum);
17        return sum;
18    }
19}