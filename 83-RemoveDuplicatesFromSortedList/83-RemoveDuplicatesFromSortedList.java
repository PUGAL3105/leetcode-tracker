// Last updated: 09/07/2026, 09:52:08
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
    public ListNode deleteDuplicates(ListNode head) {
      ListNode r =head;
      while(head != null && head.next != null)
      {
        if(head.val == head.next.val)
        {
            head.next = head.next.next;
        }
        else
        head = head.next;
      }
      return r;
      
        
    }
}