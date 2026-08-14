// Last updated: 14/08/2026, 09:54:34
1class Solution {
2    class Pair
3       { int row;
4       int col;
5        Pair(int row,int col)
6        {
7            this.row=row;
8            this.col=col;
9        }
10       }
11    public int orangesRotting(int[][] grid) {
12       int n=grid.length;//row
13       int m=grid[0].length;//column
14       Queue<Pair>q=new LinkedList<>();
15       int fresh=0;
16       for(int i=0;i<n;i++)
17       {
18        for(int j=0;j<m;j++)
19        {
20            if(grid[i][j]==2)
21            {
22                q.offer(new Pair(i,j));
23            }
24            if(grid[i][j]==1)
25            {
26                fresh ++;
27            }
28        }
29       }
30       if(fresh==0)
31       {
32        return 0;
33       }
34       int time=0;
35       int dr[]={-1,1,0,0};
36       int dc[]={0,0,-1,1};
37       while(!q.isEmpty())
38       {
39            int size=q.size();
40            boolean rotten=false; 
41            for(int i=0;i<size;i++)
42            {
43                Pair curr=q.poll();
44                //caluation of connected cells 
45                for(int j=0;j<4;j++)
46                {
47                    int nr=dr[j]+curr.row;
48                    int nc=dc[j]+curr.col;
49                    if(nr>=0&&nr<n&&nc>=0&&nc<m&&grid[nr][nc]==1)
50                    {
51                        grid[nr][nc]=2;
52                        fresh--;
53                        q.offer(new Pair(nr,nc));
54                        rotten =true;
55                    }
56                }
57            }
58            if(rotten)
59            {
60                time++;
61            }
62       }
63       if(fresh==0)
64       {
65        return time;
66       }
67       else{
68        return -1;
69       }
70    }
71}