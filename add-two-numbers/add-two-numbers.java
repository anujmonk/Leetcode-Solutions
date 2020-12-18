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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pointer_l1=l1;
        ListNode pointer_l2=l2;
        int size=0;
        
        ListNode result=null;
        
        while(pointer_l1!=null){
            size++;
            pointer_l1=pointer_l1.next;
        }
        pointer_l1=null;
        
        while(pointer_l2!=null){
            size--;
            pointer_l2=pointer_l2.next;
        }
        pointer_l2=null;
        
        if(size>=0)
            result=l1;
        else
            result=l2;
        
        ListNode pointer=result;
        
        int carry=0;
        while(l1!=null && l2!=null){
            if((carry+l1.val+l2.val)/10==1){
                pointer.val=(carry+l1.val+l2.val)%10;
                carry=1;
            }
            else{
