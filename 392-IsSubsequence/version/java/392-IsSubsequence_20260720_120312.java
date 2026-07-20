// Last updated: 20/07/2026, 12:03:12
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        // 1 ms code beat 53% 
4        // int si=0;
5        // if(s.length()<1)
6        //     return true;
7        // for(int i=0;i<t.length();i++){
8        //     if(s.charAt(si)==t.charAt(i))
9        //         si++;
10
11        //     if(si==s.length())
12        //         return true;
13        // }
14
15
16    // 1 ms beat 100
17    int i=0,j=0;
18    int n=t.length();
19    int m=s.length();
20    char ss[]=s.toCharArray();
21    char tt[]=t.toCharArray();
22
23    if(m<1)
24        return true;
25
26    while(i<n){
27        if(tt[i]==ss[j]){
28            j++;
29        }
30        i++;
31        
32    if(j==m)
33        return true;
34    }
35
36        return false;
37    }
38}