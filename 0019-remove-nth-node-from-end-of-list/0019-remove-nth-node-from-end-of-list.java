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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;    //if LL have 0 or 1 element
        int c=0;                                          //count no elements in LL
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        if(n==c) return head.next;                        //if n==c then we have to remove head
        temp=head;
        for(int i=0; i<c-n-1; i++) temp=temp.next;
        if(n==1) temp.next=null;                          //if n==1 then we have to remove last element
        else temp.next=temp.next.next;                    // removing nth element
        return head;
        
    }
}