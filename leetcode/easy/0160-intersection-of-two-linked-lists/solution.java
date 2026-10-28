/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode n1 = headA;
//         ListNode n2 = headB;
//         int l1=1,l2=1;
//         while(n1.next != null)
//         {
//             n1 = n1.next;
//             l1++;
//         }
//         while(n2.next != null)
//         {
//             n2 = n2.next;
//             l2++;
//         }
//         n1 = headA;
//         n2 = headB;
//         int i=0;
//         if(l1>l2)
//         {
//             for(i=0; i<l1-l2; i++)
//             {
//                 n1 = n1.next;
//             }
//         }
//         else
//         {
//             for(i=0; i<l2-l1; i++)
//             {
//                 n2 = n2.next;
//             }
//         }

//         while(n1 != n2)
//         {
//             n1 = n1.next;
//             n2 = n2.next;
//         }
        
//         return n1;
//     }
// }
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        
        ListNode t1 = headA;
        ListNode t2 = headB;
        
        while (t1 != t2) {
            t1 = (t1 == null) ? headB : t1.next;
            t2 = (t2 == null) ? headA : t2.next;
        }
        
        return t1;
    }
}