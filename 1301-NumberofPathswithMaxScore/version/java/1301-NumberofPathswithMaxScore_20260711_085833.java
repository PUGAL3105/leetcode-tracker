// Last updated: 11/07/2026, 08:58:33
1
2class Solution {
3    public int[] pathsWithMaxScore(List<String> board) {
4        int row = board.size();
5        int col = board.getFirst().length();
6        int MOD = 1000000007;
7        int maxScore = 0;
8        int maxScoreCount = 0;
9        boolean noPath = true;
10        char[][] boardChar = new char[board.size()][board.getFirst().length()];
11        int[][] boardMaxScore = new int[board.size()][board.getFirst().length()];
12        int[][] boardMaxScoreCount = new int[board.size()][board.getFirst().length()];
13
14        int[][] directions = {{0, 1}, {1, 0}, {1, 1}};
15
16        for (int i = 0; i < board.size(); i++) {
17            boardChar[i] = board.get(i).toCharArray();
18        }
19
20        if (boardChar[row - 1][col - 1] == 'S') {
21            boardChar[row - 1][col - 1] = '0';
22            boardMaxScoreCount[row - 1][col - 1] = 1;
23        }
24
25        if (boardChar[0][0] == 'E') {
26            boardChar[0][0] = '0';
27        }
28
29        for (int i = row - 1; i >= 0; i--) {
30            for (int j = col - 1; j >= 0; j--) {
31                noPath = true;
32
33                for (int k = 0; k < directions.length; k++) {
34                    int iRow = i + directions[k][0];
35                    int iCol = j + directions[k][1];
36
37                    if (iRow < row && iCol < col &&
38                        boardChar[iRow][iCol] != 'X' &&
39                        boardChar[i][j] != 'X') {
40
41                        int candidate = boardMaxScore[iRow][iCol] + boardChar[i][j] - '0';
42
43                        if (boardMaxScore[i][j] == candidate) {
44                            noPath = false;
45                            boardMaxScoreCount[i][j] =
46                                (boardMaxScoreCount[i][j] + boardMaxScoreCount[iRow][iCol]) % MOD;
47                        } else if (boardMaxScore[i][j] < candidate) {
48                            boardMaxScore[i][j] = candidate;
49                            boardMaxScoreCount[i][j] = boardMaxScoreCount[iRow][iCol];
50                            noPath = false;
51                        }
52                    }
53                }
54
55                if (noPath && (i < row - 1 || j < col - 1)) {
56                    boardChar[i][j] = 'X';
57                }
58            }
59        }
60
61        return new int[]{boardMaxScore[0][0], boardMaxScoreCount[0][0]};
62    }
63}