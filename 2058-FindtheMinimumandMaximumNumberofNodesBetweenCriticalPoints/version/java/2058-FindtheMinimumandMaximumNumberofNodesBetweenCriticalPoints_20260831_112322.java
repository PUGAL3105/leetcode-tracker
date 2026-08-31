// Last updated: 31/08/2026, 11:23:22
1class Solution {
2    public int[] nodesBetweenCriticalPoints(ListNode head) {
3        ListNode prev = head;
4        ListNode cur = head.next;
5
6        int idx = 1;
7
8        int firstCritical = -1;
9        int lastCritical = -1;
10        int minDist = Integer.MAX_VALUE;
11
12        while(cur.next != null){
13            ListNode next = cur.next;
14
15            boolean isMax = cur.val > prev.val && cur.val > next.val;
16            boolean isMin = cur.val < prev.val && cur.val < next.val;
17
18            if(isMax || isMin){
19                if(lastCritical == -1){
20                    firstCritical = idx;
21                }
22                else {
23                    minDist = Math.min(minDist, idx - lastCritical);
24                }
25
26                lastCritical = idx;
27            }
28
29            prev = cur;
30            cur = next;
31            idx++;
32        }
33
34        if(firstCritical == -1 || firstCritical == lastCritical){
35            return new int[]{-1, -1};
36        }
37
38        int maxDist = lastCritical - firstCritical;
39
40        return new int[]{minDist, maxDist};
41    }
42}