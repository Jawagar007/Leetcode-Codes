// Last updated: 20/07/2026, 11:53:34
1class Solution {
2     public int strStr(String haystack, String needle) {
3        int indx = 0;
4        int needleIndex = 0;
5        for (int i = 0; i < haystack.length(); i++) {
6            char hs = haystack.charAt(i);
7            char n = needle.charAt(needleIndex);
8            if ((hs == n) && (needleIndex == needle.length() - 1)) {
9                return needleIndex == 0 ? i : indx;
10            } else if (hs == n) {
11                if (needleIndex == 0) {
12                    indx = i;
13                }
14                needleIndex++;
15            } else if(needleIndex > 0){
16                i = indx;
17                needleIndex = 0;
18            }
19        }
20        return -1;
21    }
22}