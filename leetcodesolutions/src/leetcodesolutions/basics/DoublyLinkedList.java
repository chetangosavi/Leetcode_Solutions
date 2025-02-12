package leetcodesolutions.basics;

public class DoublyLinkedList {
    //class for creating Node in linkedlist
	class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int data){
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	Node head;
	
	DoublyLinkedList(){
		this.head = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
