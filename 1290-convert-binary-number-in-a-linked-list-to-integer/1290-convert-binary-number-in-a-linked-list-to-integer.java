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
 import java.math.*;
class Solution {
    
    public int getDecimalValue(ListNode head) {
        ListNode h=head;
        int n=0;
        while(h.next!=null)
        {

            n++;
            h=h.next;
        }
        n++;
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
          array[i]=head.val;
           head=head.next;
        }
        
       
        int sum=0;
        int count=n;
        for(int i=n-1;i>=0;i--)
        {
            if(array[i]==1)
            {
                sum=sum+(int) Math.pow(2,count-i-1);
            }
            else
                continue;
        }
    return sum;

       
    }
}
