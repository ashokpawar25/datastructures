package datastructure;

import javax.accessibility.AccessibleRelationSet;

public class CircularQueue 
{
	int queue[];
	static int size;
	static int front=-1;
	static int rear=-1;
	
	CircularQueue(int size)
	{
		this.size=size;
		queue=new int[size];
	}
	
	public static boolean isEmpty()
	{
		return rear==-1 && front==-1;
	}
	
	public static boolean isFull() {
		return (rear+1)%size==front;
	}
	
	void addElement(int data)
	{
		if (isFull()) 
		{
			System.out.println("queue is full");
			return;
		}
		else {
			if (front==-1) {
				front=0;
			}
			
			rear=(rear+1)%size;
			queue[rear]=data;
		}
	}
	
	public void deleteElement() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return;
		}
		else {
			if (rear==front) {
				front = rear = -1;
			}
			else {
				front=(front+1)%size;
			}
			
		}
	}
	void display()
	{
		if (isEmpty()) {
			System.out.println("queue is empty");
			return;
		}
		int i=front;
		
		do {
			System.out.print(queue[i]+" <- ");
			i=(i+1)%size;
		} while (i!=rear);
		System.out.print(queue[rear]);
		System.out.println(" <- END");
	}

	public static void main(String[] args) 
	{
		CircularQueue c=new CircularQueue(5);
		c.addElement(3);
		c.addElement(4);
		c.addElement(5);
		c.addElement(6);
		c.addElement(7);
		
		c.display();
		c.deleteElement();
		c.display();
		c.addElement(8);
		c.deleteElement();
		c.addElement(9);
		c.display();
	}

}
