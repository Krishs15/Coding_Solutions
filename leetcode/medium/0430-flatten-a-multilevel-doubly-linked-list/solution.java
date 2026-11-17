/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null)
        return head;

        FlattenRec(head);
        return head;
    }
    private Node FlattenRec(Node curr)
    {
        Node tail = curr;
        Node next = null, childhead = null, childtail = null;
        while(curr != null)
        {
            next = curr.next;
            if(curr.child != null)
            {
                childhead = curr.child;
                childtail = FlattenRec(childhead);
                curr.child = null;
                curr.next = childhead;
                childhead.prev = curr;

                if(next != null)
                {
                    childtail.next = next;
                    next.prev = childtail;
                }
                tail = childtail;
                curr = next;
            }
            else
            {
                tail = curr;
                curr = curr.next;
            }
        }
        return tail;
    }
}