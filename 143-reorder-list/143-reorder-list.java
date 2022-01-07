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
    public void reorderList(ListNode head) {
        
        ListNode curr = head;
        int i=1;
        
        Map<Integer,ListNode> map = new HashMap<>();
        while(curr!=null) {
            map.put(i,curr);
            curr=curr.next;
            i++;
        }
        
        for(Map.Entry<Integer,ListNode> entry : map.entrySet()) {
            entry.getValue().next=null;
        }
        --i;
        int low=1,high=i;
        curr=head;
        ListNode prev = null;
        while(low<high) {
            curr=map.get(low);
            ListNode temp=map.get(high);
            if(curr!=head) {
                System.out.println("here"+" Curr:"+curr.val+" Prev:"+prev.val+" Temp:"+temp.val);
                prev.next=curr;
                curr.next=temp;
                prev=temp;
            }
            else {
                curr.next=temp;
                prev=temp;
            }
            low++;
            high--;
        }
        
        if(i%2==1 && prev!=null) {
            
            ListNode t= map.get(low);
            prev.next=t;
            t.next=null;
        }
        // ListNode t=map.get(high);
        // t.next=null;
    }
}