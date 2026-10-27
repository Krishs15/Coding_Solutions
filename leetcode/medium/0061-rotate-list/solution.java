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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        
        k = k % len;
        if (k == 0) {
            return head;
        }
        
        ListNode newtail = head;
        for (int i = 0; i < len - k - 1; i++) {
            newtail = newtail.next;
        }
        
        ListNode newhead = newtail.next;
        tail.next = head;
        newtail.next = null;
        
        return newhead;
    }
}