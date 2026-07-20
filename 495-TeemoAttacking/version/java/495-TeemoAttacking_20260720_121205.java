// Last updated: 20/07/2026, 12:12:05
1class Solution {
2    public int findPoisonedDuration(int[] timeSeries, int duration) {
3        int total = 0;
4        for (int i = 0; i < timeSeries.length-1; i++) {
5            // if next attack occurs before current duration ends, include the difference
6            if (timeSeries[i+1] <= timeSeries[i] + duration-1) {
7                total += timeSeries[i+1] - timeSeries[i];
8            } else { // add duration normally
9                total += duration;
10            }
11        }
12        total += duration; // include last attack from teemo
13        return total;
14    }
15}