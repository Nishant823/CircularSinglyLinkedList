package circularSinglyLinkedList;
import java.util.Scanner;

public class CheckCircularLinkedList {
	public static boolean checkCircular(Node head)
	{
		if(head==null)
		{
			return false;
		}
		Node curr=head;
		while(curr.next!=head)
		{
			if(curr.next==null)
			{
				return false;
			}
			curr=curr.next;
		}
		
		return true;
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
		Node head=new Node(arr[0]);
		Node curr=head;
		for(int i=1;i<n;i++)
		{
			curr.next=new Node(arr[i]);
			curr=curr.next;
		}
		curr.next=head;
		boolean check=checkCircular(head);
		if(check==true)
		{
			System.out.println("Hence LinkedList is Circular");
		}
		else
		{
			System.out.println("Hence LinkedList is not Circular");
		}
		sc.close();

	}

}
