// Last updated: 20/07/2026, 12:33:59
1class Solution {
2    static ArrayList<Integer> goodNumbers = new ArrayList<>();
3    static ArrayList<Integer> goodNumberCount = new ArrayList<>();
4    public int rotatedDigits(int n) {
5        if(goodNumbers.isEmpty()) {
6            createAGoodNumberList();
7        }
8        return goodNumberCount.get(n);
9    }
10
11    private void createAGoodNumberList() {
12        int count = 0;
13        for(int num = 0; num <= 10000; num++) {
14            boolean isValid = isValidGoodNumber(num);
15            if(isValid) {
16                count++;
17                goodNumbers.add(num);
18            }
19            goodNumberCount.add(count);
20        }
21    }
22
23    private boolean isValidGoodNumber(int num) {
24        boolean isValid = false;
25        while(num > 0) {
26            int digit = num % 10;
27            if( digit == 3 || digit == 4 || digit == 7) {
28                return false;
29            }
30            if(digit == 2 || digit == 5 || digit == 6 || digit == 9) {
31                isValid = true;
32            }
33            num /= 10;
34        }
35        return isValid;
36    }
37}