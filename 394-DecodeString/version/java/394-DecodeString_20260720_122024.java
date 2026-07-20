// Last updated: 20/07/2026, 12:20:24
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> intStack = new Stack<>();
4        Stack<String> stringStack = new Stack<>();
5        int k=0;
6
7        for(char c : s.toCharArray()){
8            if(Character.isDigit(c)){
9                k = (k * 10) + (c - '0');
10                continue;
11            }
12
13            if(c=='['){
14                intStack.push(k);
15                k = 0;
16                stringStack.push(String.valueOf(c));
17                continue;
18            }
19
20            if(c != ']'){
21                stringStack.push(String.valueOf(c));
22                continue;
23            }
24
25            StringBuilder item = new StringBuilder();
26            while(!stringStack.peek().equals("[")){
27                item.insert(0, stringStack.pop());
28            }
29
30            stringStack.pop();
31
32            StringBuilder replacement = new StringBuilder();
33            int n = intStack.pop();
34            for(int i=0; i<n; i++){
35                replacement.append(item);
36            }
37            
38            stringStack.push(replacement.toString());
39        }
40
41        StringBuilder result = new StringBuilder();
42        while(!stringStack.isEmpty()){
43            result.insert(0, stringStack.pop());
44        }
45        return result.toString();
46    }
47}