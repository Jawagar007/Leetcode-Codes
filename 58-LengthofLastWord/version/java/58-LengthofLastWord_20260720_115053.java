// Last updated: 20/07/2026, 11:50:53
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String arr[]=s.split(" ");
4        return arr[arr.length-1].length();
5    }
6}