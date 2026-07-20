// Last updated: 20/07/2026, 12:26:43
1class Solution {
2    public int surfaceArea(int[][] grid) {
3        int sum = 0;
4        for (int i = 0; i < grid.length; i++) {
5            for (int j = 0; j < grid[0].length; j++) {
6                int h = grid[i][j];
7                int fullS = h > 0 ? h * 4 + 2 : 0;
8                //check adjacent and substract touching surface
9                //check left
10                if (cellExists(i, j - 1, grid)) {
11                    if (h <= grid[i][j - 1]) {
12                        fullS -= h;
13                    } else {
14                        fullS -= grid[i][j - 1];
15                    }
16                }
17                //check up
18                if (cellExists(i - 1, j, grid)) {
19                    if (h <= grid[i - 1][j]) {
20                        fullS -= h;
21                    } else {
22                        fullS -= grid[i - 1][j];
23                    }
24                }
25                //check right
26                if (cellExists(i, j + 1, grid)) {
27                    if (h <= grid[i][j + 1]) {
28                        fullS -= h;
29                    } else {
30                        fullS -= grid[i][j + 1];
31                    }
32                }
33                //check down
34                if (cellExists(i + 1, j, grid)) {
35                    if (h <= grid[i + 1][j]) {
36                        fullS -= h;
37                    } else {
38                        fullS -= grid[i + 1][j];
39                    }
40                }
41                sum += fullS;
42            }
43        }
44        return sum;
45    }
46
47    private static boolean cellExists(int row, int col, int[][] array) {
48        return (row <= array.length - 1 && row >= 0) && (col <= array[0].length - 1 && col >= 0);
49    }
50}