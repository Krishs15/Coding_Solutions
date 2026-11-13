/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node mergeKLists(Node[] arr) {
        if (arr == null || arr.length == 0) 
        return null;
        return mergeKLists(arr, 0, arr.length - 1);
    }

    private Node mergeKLists(Node[] arr, int left, int right) 
    {
        if (left == right) 
        return arr[left];

        int mid = left + (right - left) / 2;
        Node leftList = mergeKLists(arr, left, mid);
        Node rightList = mergeKLists(arr, mid + 1, right);

        return mergeTwoLists(leftList, rightList);
    }

    private Node mergeTwoLists(Node l1, Node l2) 
    {
        Node temp = new Node(0);
        Node tail = temp;

        while (l1 != null && l2 != null) 
        {
            if (l1.data <= l2.data) 
            {
                tail.next = l1;
                l1 = l1.next;
            } 
            else 
            {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;
        return temp.next;
    }
}