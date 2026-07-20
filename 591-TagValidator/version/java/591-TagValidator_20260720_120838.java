// Last updated: 20/07/2026, 12:08:38
1import java.util.regex.*;
2public class Solution {
3    Stack < String > stack = new Stack < > ();
4    boolean contains_tag = false;
5    public boolean isValidTagName(String s, boolean ending) {
6        if (ending) {
7            if (!stack.isEmpty() && stack.peek().equals(s))
8                stack.pop();
9            else
10                return false;
11        } else {
12            contains_tag = true;
13            stack.push(s);
14        }
15        return true;
16    }
17    public boolean isValid(String code) {
18        String regex = "<[A-Z]{0,9}>([^<]*(<((\\/?[A-Z]{1,9}>)|(!\\[CDATA\\[(.*?)]]>)))?)*";
19        if (!Pattern.matches(regex, code))
20            return false;
21        for (int i = 0; i < code.length(); i++) {
22            boolean ending = false;
23            if (stack.isEmpty() && contains_tag)
24                return false;
25            if (code.charAt(i) == '<') {
26                if (code.charAt(i + 1) == '!') {
27                    i = code.indexOf("]]>", i + 1);
28                    continue;
29                }
30                if (code.charAt(i + 1) == '/') {
31                    i++;
32                    ending = true;
33                }
34                int closeindex = code.indexOf('>', i + 1);
35                if (closeindex < 0 || !isValidTagName(code.substring(i + 1, closeindex), ending))
36                    return false;
37                i = closeindex;
38            }
39        }
40        return stack.isEmpty();
41    }
42}