/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (head == null) 
        return ans;
        
        Node left = head;
        Node right = head;
        
        while(right.next!=null)
        {
            right = right.next;
        }
        
        while (left != null && right != null && left != right && right.next != left)
        {
            int sum = left.data + right.data;
            if(sum == target)
            {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                ans.add(pair);
                left = left.next;
                right = right.prev;
            }
            else if(sum > target)
            right = right.prev;
            else
            left = left.next;
        }
        return ans;
    }
}