// Last updated: 14/08/2026, 10:09:49
1class Solution {
2    public int appendCharacters(String s, String t) {
3
4        int i = 0;
5        int j = 0;
6
7        while (i < s.length() && j < t.length()) {
8
9            if (s.charAt(i) == t.charAt(j)) {
10                j++;
11            }
12
13            i++;
14        }
15
16        return t.length() - j;
17    }
18}