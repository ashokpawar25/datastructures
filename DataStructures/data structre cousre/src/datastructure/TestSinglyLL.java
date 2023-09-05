package datastructure;

public class TestSinglyLL
{

	public static void main(String[] args) 
	{
		SinglyLL list=new SinglyLL();
		list.insertFirst(5);
		list.insertLast(6);
		list.display();
		list.insertIndex(7, 1);
		list.display();
		list.deleteIndex(1);
		list.display();
		list.deleteFirst();
		list.display();
		list.deleteLast();
		list.display();
	}

}
