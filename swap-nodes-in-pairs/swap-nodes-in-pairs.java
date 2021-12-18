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
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null) {
            return head;
        }
        
        ListNode prev = head;
        ListNode curr = head.next;
        return helper(prev,curr);
    
    }
    
    private ListNode helper(ListNode prev, ListNode curr) {
        
        ListNode temp=curr.next;
        prev.next=temp;
        curr.next=prev;
        if(prev.next==null || prev.next.next==null) {
            return curr;
        }
        
        prev.next=helper(prev.next,prev.next.next);
        return curr;
        
        
    }
}