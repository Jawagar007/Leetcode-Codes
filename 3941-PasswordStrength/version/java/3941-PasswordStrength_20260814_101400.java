// Last updated: 14/08/2026, 10:14:00
1class Solution {
2    public int passwordStrength(String password) {
3        boolean[] seen = new boolean[128];
4        char[] cha = password.toCharArray();
5        int sum = 0;
6        for(char ch : cha){
7            if(!seen[ch]){
8                sum += points(ch);
9                seen[ch] = true;
10            }
11        }
12        return sum;
13    }
14    static int points(char a){
15        if( Character.isLowerCase(a)){
16            return 1;
17        }
18        if(Character.isUpperCase(a)){
19            return 2;
20        }
21        if(Character.isDigit(a)){
22            return 3;
23        }
24        if("!@#$".contains(String.valueOf(a))) {
25            return 5;
26        }
27        return 0;
28    }
29}