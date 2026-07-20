// Last updated: 20/07/2026, 12:19:01
1class Solution {
2    public String[] findWords(String[] words) {
3        ArrayList<String> list = new ArrayList<>();
4        String first  = "qwertyuiop";
5        String second = "asdfghjkl";
6        String third  = "zxcvbnm";
7
8        for (String word : words) {
9            if (isinrow(word, first) || isinrow(word, second) || isinrow(word, third)) {
10                list.add(word);
11            }
12        }
13
14        return list.toArray(new String[0]); // cleaner than manual array copy
15    }
16
17    private boolean isinrow(String s, String row) {
18        for (char c : s.toCharArray()) {
19            if (row.indexOf(Character.toLowerCase(c)) == -1) return false;
20        }
21        return true;
22    }
23}