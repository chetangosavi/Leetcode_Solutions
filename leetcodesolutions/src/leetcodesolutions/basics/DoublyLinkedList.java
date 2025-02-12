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
	Node tail;
	
	DoublyLinkedList(){
		this.head = null;
		this.tail = null;
	}
	
	void addNodeAtHead(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	
	void addNodeAtTail(int data) {
		Node newNode = new Node(data);
		if(tail == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.next = tail;
			tail.next = newNode;
			tail=newNode;
		}
	}
	
	void addNodeInMiddle(Node prevNode, int data) {
		if(prevNode == null) {
			return;
		}
		
		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		newNode.prev = prevNode;
		if(newNode.next!=null) {
			newNode.next.prev = newNode;
		}
		else{
			tail = newNode;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
