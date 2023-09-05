package datastructure;

import java.util.Scanner;

import javax.swing.plaf.IconUIResource;

public class StackTest 
{
	int top=-1;
	static int [] stack;
	void push(int data)
	{
		if (top==stack.length-1) 
		{
			System.out.println("stack is full");
		}
		else {
			top++;
			stack[top]=data;
		}
		
	}
	
	void pop()
	{
		if (top==-1) {
			System.out.println("stack is empty");
		}
		else {
			top--;
		}
	}
	
	void display() 
	{
		for(int i=top;i>=0;i--)
		{
			System.out.print(stack[i]+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) 
	{
				Scanner sc=new Scanner(System.in);
		System.out.println("enter size of stack");
		int size=sc.nextInt();
		stack=new int [size];
		
		StackTest t=new StackTest();
		t.push(5);
		t.push(4);
		t.push(3);
		t.display();
		t.pop();
		t.display();
		
	}

}
