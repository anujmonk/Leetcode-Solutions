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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        if(k==0)
            return head;
        ListNode pointer=head;
        int size=0;
        while(pointer!=null){
            size++;
            pointer=pointer.next;
        }
        int index=size-(k%size);
        int count=1;
        pointer=head;
        while(count!=index){
            pointer=pointer.next;
            count++;
        }
        ListNode new_head=pointer.next;
        pointer.next=null;
        pointer=new_head;
        if(pointer!=null){
            while(pointer.next!=null)
                pointer=pointer.next;
            pointer.next=head;
            head=new_head;
        }
        return head;
    }
}
