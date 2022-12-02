class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ab=new ListNode(0);
        ListNode l3=ab;
        int carry=0;
        while(l1!=null || l2!=null){
            int val1=(l1!=null)?l1.val:0;
            int val2=(l2!=null)?l2.val:0;
            int sum=val1+val2+carry;
            carry=sum/10;
            int l_digit=sum%10;
            
            ListNode new_node=new ListNode(l_digit);
            l3.next=new_node;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
            l3=l3.next;
        }
        if(carry>0){
            ListNode node=new ListNode(carry);
            l3.next=node;
            l3=l3.next;
        }
        return ab.next;
        
    }
}