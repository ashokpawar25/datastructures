package datastructure;

public class SinglyCLL 
{
	Node head,tail;
	int size;
	
	void insertFirst(int value)
	{
		Node node=new Node(value);
		if (head==null) 
		{
			head=node;
			tail=node;
			size++;
		}
//		else if (head==tail)
//		{
//			head.next=node;
//			tail=node;
//			tail.next=head;
//		}
		else 
		{
			node.next=head;
			tail.next=node;
			tail=node;
			size++;
		}
	}
	
	void display()
	{
		
		if (size==1)
		{
			System.out.println(head.value);
		}
		else
		{
			Node temp=head;
			while(temp.next!=head)
			{
				System.out.print(temp.value+" ");
				temp=temp.next;
			}
		}
			
		System.out.println(" ");
	}
	
	class Node
	{
		int value;
		Node next;
		Node(int value)
		{
			this.value=value;
		}
	}
}
