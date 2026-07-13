// Last updated: 13/07/2026, 08:54:29
1import java.util.*;
2
3class Solution {
4    public int[] arrayRankTransform(int[] arr) {
5
6        int[] temp = arr.clone();
7        Arrays.sort(temp);
8
9        HashMap<Integer, Integer> map = new HashMap<>();
10        int rank = 1;
11
12        for (int i = 0; i < temp.length; i++) {
13            if (!map.containsKey(temp[i])) {
14                map.put(temp[i], rank);
15                rank++;
16            }
17        }
18
19        for (int i = 0; i < arr.length; i++) {
20            arr[i] = map.get(arr[i]);
21        }
22
23        return arr;
24    }
25}