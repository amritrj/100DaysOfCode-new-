class Solution {
    public void reorderList(ListNode head) {
         if (head.next == null || head.next.next == null) return;
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        temp = head;
        int size = stack.size();
        for (int i = 0; i < size / 2; i++) {
            ListNode mem = temp.next;
            temp.next = stack.pop();
            temp.next.next = mem;
            temp = mem;
        }
        temp.next = null;  
    }
}