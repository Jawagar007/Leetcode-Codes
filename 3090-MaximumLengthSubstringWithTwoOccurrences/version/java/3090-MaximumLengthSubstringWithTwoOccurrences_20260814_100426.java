// Last updated: 14/08/2026, 10:04:26
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int res = 0;
4        int low = 0;
5        HashMap<Character,Integer> h=new HashMap<>();
6        for(int high=0;high<s.length();high++){
7            char ch=s.charAt(high);
8            h.put(ch,h.getOrDefault(ch,0)+1);
9            while(h.get(ch)>2){
10                char temp=s.charAt(low);
11                h.put(temp,h.get(temp)-1);
12                if(h.get(temp)==0)
13                h.remove(temp);
14                low++;
15            }
16            res=Math.max(res,high-low+1);
17        }
18        return res;
19    }
20}