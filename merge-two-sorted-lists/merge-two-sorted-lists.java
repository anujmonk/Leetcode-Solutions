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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)
            return null;
        
        ListNode result=null;
        
        // Determining the head of the list from both the list
        if(l1!=null)
        {
            if(l2!=null){
                if(l1.val<=l2.val)
                    result=l1;
                else
                    result=l2;
            }
            else{
                return l1;
            }
        }
        else{
            return l2;
        }
        
        ListNode pointer_l1=null;
        ListNode pointer_l2=null;
        
        if(result==l1){
            
            while(l1!=null && l2!=null){
                if(l1.val<=l2.val){
                    pointer_l1=l1;
                    l1=l1.next;
                }
