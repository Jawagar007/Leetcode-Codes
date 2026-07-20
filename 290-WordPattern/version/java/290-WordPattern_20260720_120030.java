// Last updated: 20/07/2026, 12:00:30
1class Solution {
2
3    public boolean wordPattern(String pattern, String s) {
4
5        String[] words = s.split(" ");
6
7        if(words.length != pattern.length()){
8            return false;
9        }
10
11        HashMap<Character, String> mapPW = new HashMap<>();
12        HashMap<String, Character> mapWP = new HashMap<>();
13
14        for(int i = 0; i < pattern.length(); i++){
15
16            char ch = pattern.charAt(i);
17            String word = words[i];
18
19            if(mapPW.containsKey(ch)){
20                if(!mapPW.get(ch).equals(word)){
21                    return false;
22                }
23            }else{
24                mapPW.put(ch, word);
25            }
26
27            if(mapWP.containsKey(word)){
28                if(mapWP.get(word) != ch){
29                    return false;
30                }
31            }else{
32                mapWP.put(word, ch);
33            }
34        }
35
36        return true;
37    }
38}