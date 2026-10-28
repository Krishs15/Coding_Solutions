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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode great = new ListNode(0);
        ListNode s = small;
        ListNode g = great;
        ListNode curr = head;

        while(curr != null)
        {
            if(curr.val < x)
            {
                s.next = curr;
                s = s.next;
            }
            else
            {
                g.next = curr;
                g = g.next;
            }
            curr = curr.next;
        }

        g.next = null;
        s.next = great.next;

        return small.next;
    }
}