/* Structure of Linked List Node
class Node {
	int data;
	Node next;
	Node(int val) {
		data = val;
		next = null;
	}
} */
class Solution {
	public static void removeLoop(Node head) {
		if (head == null || head.next == null) 
		{
			return;
		}
		
		Node slow = head;
		Node fast = head;
		boolean loop = false;
		
		while (fast != null && fast.next != null) 
		{
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) 
			{
				loop = true;
				break;
			}
		}
		
		if (!loop) 
		{
			return;
		}
		
		if (slow == head) 
		{
			fast = head;
			while (fast.next != slow) 
			{
				fast = fast.next;
			}
			fast.next = null;
			return;
		}
		
		slow = head;
		while (slow != fast) 
		{
			slow = slow.next;
			fast = fast.next;
		}
		
		Node prev = fast;
		while (prev.next != slow) 
		{
			prev = prev.next;
		}
		prev.next = null;
	}
}
