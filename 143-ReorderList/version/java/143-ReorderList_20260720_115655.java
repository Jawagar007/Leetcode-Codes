// Last updated: 20/07/2026, 11:56:55
1  public class Solution {
2    
3    public void reorderList(ListNode head) {
4      if (head == null || head.next == null)
5          return;
6      
7      // step 1. cut the list to two halves
8      // prev will be the tail of 1st half
9      // slow will be the head of 2nd half
10      ListNode prev = null, slow = head, fast = head, l1 = head;
11      
12      while (fast != null && fast.next != null) {
13        prev = slow;
14        slow = slow.next;
15        fast = fast.next.next;
16      }
17      
18      prev.next = null;
19      
20      // step 2. reverse the 2nd half
21      ListNode l2 = reverse(slow);
22      
23      // step 3. merge the two halves
24      merge(l1, l2);
25    }
26    
27    ListNode reverse(ListNode head) {
28      ListNode prev = null, curr = head, next = null;
29      
30      while (curr != null) {
31        next = curr.next;
32        curr.next = prev;
33        prev = curr;
34        curr = next;
35      }
36      
37      return prev;
38    }
39    
40    void merge(ListNode l1, ListNode l2) {
41      while (l1 != null) {
42        ListNode n1 = l1.next, n2 = l2.next;
43        l1.next = l2;
44        
45        if (n1 == null)
46          break;
47            
48        l2.next = n1;
49        l1 = n1;
50        l2 = n2;
51      }
52    }
53
54  }