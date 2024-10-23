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
    public int pairSum(ListNode head) {
        ListNode first=head;
        ListNode last=head;
        while(last!=null)
        {
            first=first.next;
            last=last.next.next;
        }
        ListNode prev=null;
        while(first!=null)
        {
            ListNode nextnode=first.next;
            first.next=prev;
            prev=first;
            first=nextnode;
        }
        ListNode res=head;
        int k=0;
        while(prev!=null)
        {
            k=Math.max(k,prev.val+res.val);
            prev=prev.next;
            res=res.next;
        }
    return k;
        
    }
}