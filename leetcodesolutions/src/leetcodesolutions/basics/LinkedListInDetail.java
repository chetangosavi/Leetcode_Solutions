package leetcodesolutions.basics;
import java.util.LinkedList;

public class LinkedListInDetail {

	public static void main(String[] args) {
		/*
		 LinkedList:
		 	Linked List is a part of the Collection framework present in java.util package. 
		 	This class is an implementation of the LinkedList data structure which is a linear 
		 	data structure where the elements are not stored in contiguous locations and every 
		 	element is a separate object with a data part and address part. The elements are linked 
		 	using pointers and addresses and each element is known as a node.
		 
		 When to use linkedlist vs arraylist:
		 
		 	ArrayList - when retrival of data is priority rather than just insertion and deletion
		 	else use LinkedList
		 	
		 Syntax to create linkedlist:
		 
		 		LinkedList<Integer> li = new LinkedList<>();
		 		
		 Methods:
		 
		 		add() : used to insert elements into list
		 		
		 Note: It also has a few disadvantages like the nodes cannot be accessed directly instead 
		 we need to start from the head and follow through the link to reach a node we wish to access.
		 
		 */ 

		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		
		System.out.println("Linked List: "+li);
	}

}
