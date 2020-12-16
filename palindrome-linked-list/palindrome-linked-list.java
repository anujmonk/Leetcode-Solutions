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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
​
        ListNode slow=head,fast=head;
        
        // Let us first know the mid of linked list 
        
        while(true){
            if(fast==null || fast.next==null)
                break;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        // Determining the point from which we will reverse the list 
        ListNode reverse_head=null,tail=null;
        if(fast==null){
            reverse_head=slow;
            fast=head;
            while(fast.next!=slow)
                fast=fast.next;
            tail=fast;
            
        }
        else{
            reverse_head=slow.next;
            tail=slow;
        }
        ListNode prev=reverse_head;
        ListNode current=reverse_head.next;
        while(current!=null){
            prev.next=current.next;
