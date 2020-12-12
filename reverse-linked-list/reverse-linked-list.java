/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode prev=head;
        ListNode current=prev.next;
        while(current!=null){
            prev.next=current.next;
            current.next=head;
            head=current;
            current=prev.next;
        }
        return head;
    }
}
