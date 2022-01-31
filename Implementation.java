package circularSinglyLinkedList;
class Node{
	int data;
	Node next;
	Node(int x)
	{
		data=x;
		next=null;
	}
	
}

public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head= new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=head;

	}

}
