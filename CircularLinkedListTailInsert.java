package circularSinglyLinkedList;
import java.util.Scanner;
public class CircularLinkedListTailInsert {
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
	public static void insert(Node head,int data)
	{
		Node temp=new Node(data);
		Node curr=head;
		while(curr.next!=head)
		{
			curr=curr.next;
		}
		temp.next=head;
		curr.next=temp;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter the number to insert at tail: ");
		int data=sc.nextInt();
		Node head=new Node(arr[0]);
		Node curr=head;
		for(int i=1;i<n;i++)
		{
			curr.next=new Node(arr[i]);
			curr=curr.next;
			
		}
		curr.next=head;
		insert(head,data);
		print(head);
		sc.close();

	}

}
