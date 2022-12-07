class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode dummy = prev;
        
        while (prev.next != null && prev.next.next != null) {
            ListNode a = prev.next;
            ListNode b = a.next;
            
            a.next = b.next;
            b.next = a;
            prev.next = b;
            
            // Move
            prev = prev.next.next;
        }
        return dummy.next;  
    }
}