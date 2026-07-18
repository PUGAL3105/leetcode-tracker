// Last updated: 18/07/2026, 11:20:13
1class Solution {
2    public ListNode swapPairs(ListNode head) {
3        ListNode dummy = new ListNode(0, head);
4        ListNode prev = dummy, cur = head;
5
6        while (cur != null && cur.next != null) {
7            ListNode npn = cur.next.next;
8            ListNode second = cur.next;
9
10            second.next = cur;
11            cur.next = npn;
12            prev.next = second;
13
14            prev = cur;
15            cur = npn;
16        }
17
18        return dummy.next;        
19    }
20}