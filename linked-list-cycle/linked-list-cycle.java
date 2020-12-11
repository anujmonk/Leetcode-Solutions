/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode current=head;
        
        ListNode current_next=head.next;
        
        while(true){
            if(current==null || current_next==null || current_next.next==null)
                return false;
            if(current==current_next)
                return true;
            current=current.next;
            current_next=current_next.next.next;
        }
    }
}
