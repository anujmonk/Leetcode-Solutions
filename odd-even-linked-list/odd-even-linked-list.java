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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;
        
        ListNode odd_tail=head;
        if(head.next==null)
            return head;
        ListNode even_head=head.next,even_tail=head.next;
        ListNode current=even_head.next;
        while(current!=null){
            even_tail.next=current.next;
            odd_tail.next=current;
            current.next=even_head;
            odd_tail=current;
            even_tail=even_tail.next;
            if(even_tail!=null)
                current=even_tail.next;
            else
                current=null;
        }
        return head;
    }
}
