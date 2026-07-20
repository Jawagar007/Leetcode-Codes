// Last updated: 20/07/2026, 11:52:35
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode cur=head;
4        while (cur!=null){
5            while (cur.next!=null && cur.val==cur.next.val) cur.next=cur.next.next;
6            cur=cur.next;
7        }
8        return head;
9    }
10}