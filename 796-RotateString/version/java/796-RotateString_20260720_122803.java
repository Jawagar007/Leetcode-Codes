// Last updated: 20/07/2026, 12:28:03
1class Solution {
2    public boolean rotateString(String A, String B) {
3        if(A == null || B == null) {
4            //throw exception on A and B both being null?
5            return false;
6        }
7        if(A.length() != B.length()) {
8            return false;
9        }
10        if(A.length() == 0) {
11            return true;
12        }
13        for(int i = 0; i < A.length(); i++) {
14            if(rotateString(A, B, i)) {
15                return true;
16            }
17        }
18        return false;
19    }
20    
21    private boolean rotateString(String A, String B, int rotation) {
22        for(int i = 0; i < A.length(); i++) {
23            if(A.charAt(i) != B.charAt((i+rotation)%B.length())) {
24                return false;
25            }
26        }
27        return true;
28    }
29}