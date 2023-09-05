package datastructure;

public class TestDLL {

	public static void main(String[] args) 
	{
		DoublyLL list=new DoublyLL();
		list.insertFirst(4);
		list.display();
		list.insertIndex(5, 1);
		list.display();
		list.insertLast(6);
		list.insertLast(7);
		list.insertLast(8);
		list.display();
		list.deleteFirst();
		list.display();
		list.deleteLast();
		list.display();
		list.deleteIndex(0);
		list.display();
	}

}
