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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null) return null;
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        int c=0,sum=0,ans=0;
        while(l1!=null && l2!=null){
            sum=l1.val+l2.val+c;
            cur.next=new ListNode((sum)%10);
            c=(int)sum/10;
            cur=cur.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            sum=l1.val+c;
            cur.next=new ListNode((sum)%10);
            c=(int)sum/10;
            cur=cur.next;
            l1=l1.next;
        }
        while(l2!=null){
            sum=l2.val+c;
            cur.next=new ListNode((sum)%10);
            c=(int)sum/10;
            cur=cur.next;
            l2=l2.next;
        }
        if (c!=0) cur.next=new ListNode(c);
        
        return dummy.next;
        
    }
}