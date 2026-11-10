/* Structure of a doubly link list node
class Node {
    int data;
    Node prev, next;
    Node(int x) {
        data = x;
        prev = null;
        next = null;
    }
}*/

class Solution {
    public Node rotateDLL(Node head, int k) {
        // code here
        Node curr = head;
        Node prev = null;
        
        if(head == null || head.next == null)
        return head;
        
        while(curr.next!=null)
        curr = curr.next;
        
        curr.next = head;
        curr = head;
        
        for(int i=1;i<=k;i++)
        {
            prev = curr;
            curr = curr.next;
        }
        
        prev.next = null;
        curr.prev = null;
        head = curr;
        
        return head;
    }
}