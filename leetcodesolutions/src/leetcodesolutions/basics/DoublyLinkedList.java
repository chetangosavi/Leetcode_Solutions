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
			newNode.prev = tail;
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
	
	void forwardTraversal() {
		Node current = head;
		while(current!=null) {
			System.out.print(current.data + " ");
			 current = current.next;
		}
		System.out.println();
	}
	
	void backwardTraversal() {
		Node current = tail;
		while(current!=null) {
			System.out.print(current.data+" ");
			current = current.prev;
		}
		System.out.println();
	}
	
	void removeFromFront() {
		if(head == null) {
			return;
		}
		head = head.next;
		if(head!=null) {
			head.prev = null;
		}
		else {
			tail = null;
		}
	}
	
	void removeFromBack() {
		if(tail == null) {
			return;
		}
		tail = tail.prev;
		if(tail!=null) {
			tail.next = null;
		}
		else {
			head = null;
		}
	}
	
	//helper method to find node
	Node findNode(int value) {
		Node current = head;
		while(current!=null) {
			if(current.data == value) {
				return current;
			}
			current = current.next;
		}
		return null;
	}
	void removeNode(Node node) {
		if(node == null)return;
		if(node == head) {
			removeFromFront();
			return;
		}
		if(node==tail) {
			removeFromBack();
			return;
		}
		node.next.prev = node.prev;
		node.prev.next = node.next;
		
		
	}
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addNodeAtHead(1);
		list.addNodeAtTail(2);
		list.addNodeAtTail(3);
		list.addNodeAtTail(4);
		list.addNodeAtTail(5);
		list.backwardTraversal();
		list.forwardTraversal();
		list.removeFromFront();
		list.forwardTraversal();
		list.removeFromBack();
		list.forwardTraversal();
		Node nodeToDelete = list.findNode(3);
		list.removeNode(nodeToDelete);
		list.forwardTraversal();
	}

}
