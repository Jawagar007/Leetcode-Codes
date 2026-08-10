// Last updated: 10/08/2026, 10:11:04
1class Solution {
2    public boolean makeEqual(String[] words) {
3        HashMap<Character, Integer> map = new HashMap<>();
4        // can move any character from any string to any other string any number of times
5        // the arrangement inside a string doesn't matter
6        // only thing that matters is the (total count of each character % words length)
7        for(int i = 0; i < words.length; i++){
8            String word = words[i];
9            for(char ch : word.toCharArray()){
10                map.put(ch, map.getOrDefault(ch, 0) + 1);
11            }
12        }
13        for(int count: map.values()){
14            if(count % words.length != 0){
15                return false;
16            }
17        }
18        return true;
19    }
20}