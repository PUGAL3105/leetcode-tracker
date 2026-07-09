// Last updated: 09/07/2026, 09:51:15
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
    public ListNode sortList(ListNode head) {
        ArrayList<ListNode> list =  new ArrayList<>();

        ListNode dummy = head;
        while(dummy != null){
            list.add(dummy);
            dummy = dummy.next;
        }

        list.sort((a,b) -> a.val - b.val);

        ListNode resultHead = new ListNode(0);
        dummy = resultHead;
        for(int i = 0; i < list.size(); i++){
            dummy.next = list.get(i);
            dummy = dummy.next;
        }
        dummy.next =  null;

        return resultHead.next;
    }
}