package circularSinglyLinkedList;
import java.util.Scanner;

public class InsertAtbegining {
	public static void print(Node head)
	{
		if(head==null)
		{
			
			return ;
		}
		
		System.out.print(head.data+" ");
		for(Node r=head.next;r!=head;r=r.next)
		{
			System.out.print(r.data+ " ");
			
		}
		
	}
	public static Node insertAt(Node head,int n)
	{
		Node temp=new Node(n);
		if(head==null)
		{
			temp.next=temp;
		}
		
		Node curr=head;
		while(curr.next!=head)
		{
			curr=curr.next;
		}
		curr.next=temp;
		temp.next=head;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Node head=new Node(10);
		head.next=new Node (20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=head;
		System.out.print("Enter the number to insert in the bigining of linked list:");
		int n=sc.nextInt();
		head=insertAt(head,n);
		print(head);
		sc.close();

	}

}
