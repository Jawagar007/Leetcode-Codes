// Last updated: 20/07/2026, 12:24:03
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int prev = 5;   // dummy value to indicate no previous bit yet
4        
5        while(n > 0){
6            int bit = n % 2;   // get last bit
7            n /= 2;            // remove last bit
8            
9            if(prev == 5){
10                prev = bit;    // first bit, just store it
11            }else{
12                if(bit == prev) return false; // same as previous → not alternating
13                prev = bit;
14            }
15        }
16        return true;
17    }
18}