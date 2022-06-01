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
                pointer.val=carry+l1.val+l2.val;
                carry=0;
            }
            pointer=pointer.next;
            l1=l1.next;
            l2=l2.next;
        }
        
        if(pointer!=null && carry==1){
            while(pointer.next!=null && carry==1){
                if((carry+pointer.val)/10==1){
                    pointer.val=(carry+pointer.val)%10;
                    carry=1;
                    }
                else{
                pointer.val=carry+pointer.val;
                carry=0;
                }
                pointer=pointer.next;    
            }
            if(pointer.next==null && carry==1){
                if((carry+pointer.val)/10==1){
                    pointer.val=(carry+pointer.val)%10;
                    carry=1;
                    }
                else{
                    pointer.val=carry+pointer.val;
                    carry=0;
                    }
            }
            if(carry==1){
                pointer.next=new ListNode(1);
            }
        }
        else if(pointer==null && carry==1){
            pointer=result;
            while(pointer.next!=null)
                pointer=pointer.next;
            pointer.next=new ListNode(1);
        }
        
        
        return result;
    }
}