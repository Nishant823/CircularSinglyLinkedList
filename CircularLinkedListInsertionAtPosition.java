package circularSinglyLinkedList;
import java.util.Scanner;

public class CircularLinkedListInsertionAtPosition {
	public static void print(Node head)
	{
		System.out.print(head.data+" ");
		Node curr=head.next;
		while(curr!=head)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}	
		
	}
	public static int getLength(Node head)
	{
		int pos=1;
		Node curr=head;
		while(curr.next!=head)
		{
			pos++;
			curr=curr.next;
		}
		return pos;
	}
	public static Node insertAtPosition(Node head,int data,int pos)
	{
		
		if(head==null)
		{
			return null;
		}
		if(pos>getLength(head))
		{
			return head;
		}
		Node temp=new Node(data);
		if(pos==getLength(head))
		{
			Node curr=head;
			while(curr.next!=head)
			{
				curr=curr.next;
			}
			temp.next=curr.next;
			curr.next=temp;
			return head;
		}
		Node curr=head;
		for(int i=1;i<pos;i++)
		{
			
			curr=curr.next;	
		}
		temp.next=curr.next;
		curr.next=temp;
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Entert the position: ");
		int pos=sc.nextInt();
		
		System.out.print("Enter the number two insert: ");
		int data=sc.nextInt();
		
		Node head=new Node(arr[0]);
		Node curr=head;
		
		for(int i=1;i<n;i++)
		{
			curr.next=new Node(arr[i]);
			curr=curr.next;
		}
		
		curr.next=head;
		
		head=insertAtPosition(head,data,pos);
		print(head);
		
		sc.close();

	}

}
