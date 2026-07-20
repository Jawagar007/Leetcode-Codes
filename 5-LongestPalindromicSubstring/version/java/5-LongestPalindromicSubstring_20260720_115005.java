// Last updated: 20/07/2026, 11:50:05
1class Solution {
2
3    public String longestPalindrome(String s) {
4        String ans = "";
5
6        for (int i = 0; i < s.length(); i++) {
7            for (int j = i; j < s.length(); j++) {
8
9                if (isPalindrome(s, i, j)) {
10
11                    if ((j - i + 1) > ans.length()) {
12                        ans = s.substring(i, j + 1);
13                    }
14                }
15            }
16        }
17
18        return ans;
19    }
20
21    public boolean isPalindrome(String s, int left, int right) {
22
23        while (left < right) {
24
25            if (s.charAt(left) != s.charAt(right)) {
26                return false;
27            }
28
29            left++;
30            right--;
31        }
32
33        return true;
34    }
35}