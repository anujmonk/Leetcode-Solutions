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
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode result=head;
        if(head==null)
            return null;
        ListNode fast=head;
        
        // I just learned the technique of Floyd's Cycle Detection method
        
        // Created two nodes and checking if cycle exist by making the fast node switching nodes at a speed of 2 and slow node         // at a speed of 1, if cycle exist eventually they will meet. 
        
        while(true){
            if(fast==null || fast.next==null)
                return null;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        
        // Now we will move the slow and fast pointer at the same speed and the point where they meet will be the start of the         // cycle. 
        
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
