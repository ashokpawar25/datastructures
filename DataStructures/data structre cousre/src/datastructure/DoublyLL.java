package datastructure;

public class DoublyLL 
{
	Node head,tail;
	int size;
	
	void insertFirst(int value)
	{
		Node node=new Node(value);
		if (head==null) 
		{
			head=node;
			tail=head;
			size++;
		}
		else
		{
			head.prev=node;
			node.next=head;
			head=head.prev;
			size++;
		}
	}
	
	void insertIndex(int value,int index)
	{
		if (index==0)
		{
			insertFirst(value);
		}
		else if (index==size) 
		{
			insertLast(value);
		}
		else 
		{
			Node temp=getNode(index-1);
			Node node=new Node(value,temp,temp.next);
			temp.next=node;
			node.next.prev=node;
			size++;
		}
	}
	
	void insertLast(int value)
	{
		if (size==0) 
		{
			insertFirst(value);
		}
		else 
		{
			Node node=new Node(value);
			node.prev=tail;
			tail.next=node;
			tail=tail.next;
			size++;
		}
	}
	
	void deleteFirst()
	{
		if (size==1)
		{
			head=null;
			tail=null;
			size--;
		}
		else 
		{
			head=head.next;
			head.prev=null;
			size--;
		}
	}
	
	void deleteIndex(int index)
	{
		if (index==0)
		{
			deleteFirst();
		}
		else if (index==size-1)
		{
			deleteLast();
		}
		else
		{
		 	Node temp=getNode(index-1);
			temp.next=temp.next.next;
			if (temp.next!=null)
			{
				temp.next.prev=temp;
			}
			
			size--;
		}
	}
	
	void deleteLast()
	{
		if (tail==head)
		{
			deleteFirst();
		}
		else 
		{
			tail=tail.prev;
			tail.next=null;
		}
	}
	
	
	Node getNode(int index)
	{
		Node temp=head;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	
	void display()
	{
		if (head==null)
		{
			System.out.println("Empty List");
		}
		else 
		{
			Node temp=head;
			while (temp!=null) 
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
		Node prev;
		
		Node(int value)
		{
			this.value=value;
			
		}
		Node(int value,Node prev,Node next)
		{
			this.value=value;
			this.prev=prev;
			this.next=next;
		}
		
	}
}
