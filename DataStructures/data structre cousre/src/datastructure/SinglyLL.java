package datastructure;

import java.util.Iterator;
import java.util.concurrent.ForkJoinPool;

public class SinglyLL 
{
	int size=0;
	void insertFirst(int value)
	{
		Node node=new Node(value);
		node.next=head;
		head=node;
		size++;
		if (tail==null) 
		{
			tail=head;
		}
	}
	
	void insertIndex(int value,int index)
	{
		
		if (index==0) 
		{
			insertFirst(value);
			size++;
		}
		else if (index==size)
		{
			insertLast(value);
			size++;
			
		}
		else 
		{
			Node temp=head;
			for(int i=1;i<index;i++)
			{
				temp=temp.next;
			}
			Node node=new Node(value,temp.next);
			temp.next=node;
			temp=temp.next;
			size++;
			
		}
		
		
	}
	
	void insertLast(int value) 
	{
		if (tail==null) 
		{
			insertFirst(value);
			size++;
		}
		else 
		{
			Node node=new Node(value);
			tail.next=node;
			tail=tail.next;
			size++;
		}
	}
	
	void deleteFirst() 
	{
		int value=head.value;
		head=head.next;
		if (head==null) 
		{
			tail=null;
		}
		size--;
		
		System.out.println(value+" deleted successfully");
		
	}
	
	void deleteIndex(int index)
	{
		Node temp=getIndex(index-1);
		int value=temp.next.value;
		temp.next=temp.next.next;
		size--;
		System.out.println(value+" deleted successfully");
	}
	
	void deleteLast()
	{
		if (head==tail)
		{
			deleteFirst();
		}
		else 
		{
			Node secondlast=getIndex(size-2);
			int value=tail.value;
			tail=secondlast;
			tail.next=null;
			size--;
			System.out.println(value+" deleted successfully");
		}
	}
	
	Node getIndex(int index)
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
		Node temp=head;
		while (temp!=null) 
		{
			System.out.print(temp.value+"  ");
			temp=temp.next;
		}
		System.out.println(" ");
	}
	Node head,tail;
	class Node
	{
		int value;
		Node next;
		
		Node(int value)
		{
			this.value= value;
		}
		Node(int value,Node next)
		{
			this.value=value;
			this.next=next;
		}
	}
	
}
