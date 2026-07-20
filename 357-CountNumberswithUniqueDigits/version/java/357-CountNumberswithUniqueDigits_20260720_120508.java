// Last updated: 20/07/2026, 12:05:08
1class Solution {
2    public int countNumbersWithUniqueDigits(int n) {
3        int temp = 1;
4        if(n>0){
5            for(int i=0; i<n; i++){
6                int p = 1;
7                for(int j=0; j<=i; j++){
8                    if(j==0){
9                        p*=9;
10                    }
11                    else{
12                        p*=10-j;
13                    }
14                }
15                temp += p;
16            }
17        }
18        return temp;
19    }
20}