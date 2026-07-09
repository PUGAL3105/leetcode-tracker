// Last updated: 09/07/2026, 09:51:16
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode d= new ListNode(0);
        while(head != null){
            ListNode c=head;
            head = head.next;
            ListNode p=d;
            while(p.next != null && p.next.val<c.val){
                p=p.next;
            }
            c.next=p.next;
            p.next=c;
        }
        return d.next;
        
    }
}