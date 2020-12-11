/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        
        // First checking if either of the head's is null
        if(headA==null || headB==null)
            return null;
        
        
        // Run the nodes at similiar speed till one of the node is null
        while(true){
            if(a==null || b==null)
                break;
            a=a.next;
            b=b.next;
        }
        
        // Now we will interchange the one which is null to the other list head and move both node             // till the node which is not null becomes null, once it is null set it to other list head; 
        if(a==null){
            a=headB;
            while(b!=null){
                a=a.next;
                b=b.next;
            }
            b=headA;
        }
        else{
            b=headA;
            while(a!=null){
                b=b.next;
                a=a.next;
            }
            a=headB;
        }
        while(true){
            if(a==null || b==null)
                break;
            if(a==b)
                return a;
            b=b.next;
            a=a.next;
        }
        return null;
    }
}
