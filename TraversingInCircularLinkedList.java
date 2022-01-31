package circularSinglyLinkedList;

public class TraversingInCircularLinkedList {
	public static void printdo(Node head)
	{
		if(head==null)
		{
			return ;
		}
		Node curr=head;
		do {
			System.out.println(head.data+" ");
			curr=curr.next;
		}while(curr!=head);
	}
	public static void printfor(Node head)
	{
		if(head==null)
		{
			return;
		}
		System.out.print(head.data+" ");
		for(Node r=head.next;r!=head;r=r.next)
		{
			System.out.print(r.data+" ");
		}
		
	}
	public static void print(Node head)
	{
		if(head==null)
		{
			return ;
		}
		System.out.print(head.data+" ");
		Node curr=head.next;
		while(curr!=head)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=head;
		print(head);
		System.out.println();
		printfor(head);
		System.out.println();
		printdo(head);

	}

}
