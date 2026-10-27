/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
   }
} */

class Solution {
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int len = 1;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        k = k% len;
        if (k == 0) {
            return head;
        }

        Node newtail = head;
        for (int i = 0; i < k - 1; i++) {
            newtail = newtail.next;
        }

        Node newhead = newtail.next;
        tail.next = head;
        newtail.next = null;

        return newhead;
    }
}