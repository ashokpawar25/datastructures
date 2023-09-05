package datastructure;
import java.nio.channels.NonReadableChannelException;
import java.util.*;

public class QueueUsingStack 
{
	static Stack<Integer> first;
	Stack<Integer> second;
	
	public QueueUsingStack() 
	{
		first=new Stack<>();
		second=new Stack<>();
	}
	
	public void push(int item) 
	{
		first.push(item);
	}
	
	public int pop() 
	{
		while (!first.isEmpty()) 
		{
			second.push(first.pop());
		}
		
		int removed=second.pop();
		while (!second.isEmpty())
		{
			first.push(second.pop());
		}
		return removed;
	}
	public void peek() 
	{
		while (!first.isEmpty()) {
			second.push(first.pop());
		}
		System.out.println("first element is"+second.peek());
		while (!second.isEmpty()) {
			first.push(second.pop());
		}
		
	}
	public static void main(String[] args) 
	{
		QueueUsingStack q=new QueueUsingStack();
		q.push(4);
		q.push(5);
		q.push(6);
		System.out.println(q.pop());
		q.peek();
		System.out.println(q.pop());
		q.peek();
		
	}

	
}
