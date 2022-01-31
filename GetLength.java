package circularSinglyLinkedList;


public class GetLength {
	public static int getLength(Node head)
	{
		int pos=1;
		Node curr=head.next;
		while(curr!=head)
		{
			pos++;
			curr=curr.next;
		}
		return pos;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=head;
		System.out.println("The number of nodes in Linked List is: "+getLength(head));
		

	}

}
