// Last updated: 19/08/2026, 12:02:20
1class Solution {
2    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
3        Map<Integer, Integer> rows = new HashMap<>();
4
5        for (int[] r : reservedSeats) {
6            int row = r[0];
7            int seat = r[1];
8
9            if (seat == 1 || seat == 10) {
10                continue;
11            }
12
13            int mask = rows.getOrDefault(row, 0);
14            mask |= 1 << seat;
15            rows.put(row, mask);
16        }
17
18        int total = (n - rows.size()) * 2;
19
20        int leftMask = 0;
21        int middleMask = 0;
22        int rightMask = 0;
23
24        for (int seat = 2; seat <= 5; seat++) {
25            leftMask |= 1 << seat;
26        }
27
28        for (int seat = 4; seat <= 7; seat++) {
29            middleMask |= 1 << seat;
30        }
31
32        for (int seat = 6; seat <= 9; seat++) {
33            rightMask |= 1 << seat;
34        }
35
36        for (int mask : rows.values()) {
37            boolean leftFree = (mask & leftMask) == 0;
38            boolean middleFree = (mask & middleMask) == 0;
39            boolean rightFree = (mask & rightMask) == 0;
40
41            if (leftFree && rightFree) {
42                total += 2;
43            } else if (leftFree || middleFree || rightFree) {
44                total += 1;
45            }
46        }
47
48        return total;
49    }
50}