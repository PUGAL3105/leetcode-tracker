// Last updated: 20/07/2026, 08:52:37
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int total = m*n;
7        k %= total;
8
9        int newIdx = k;
10        int[][] temp = new int[m][n];
11
12        for(int x=0; x<m; x++){
13            for(int y=0; y<n; y++){
14                if(newIdx==total) newIdx = 0;
15                int nx = newIdx/n;
16                int ny = newIdx%n;
17
18                temp[nx][ny] = grid[x][y];
19                newIdx++;
20            }
21        }
22
23        List<List<Integer>> ans = new ArrayList<>();
24
25        for(int i=0; i<m; i++){
26            List<Integer> lst = new ArrayList<>();
27            for(int j=0; j<n; j++){
28                lst.add(temp[i][j]);
29            }
30            ans.add(lst);
31        }
32
33        return ans;
34    }
35}