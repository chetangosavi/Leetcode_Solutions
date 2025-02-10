package leetcodesolutions.basics;

class Node{
	String name;
	String details;
	Node next;
	Node(){}
	Node(String name, String details){
		this.name = name;
		this.details = details;
	}
	
}
class LinkedList{
	Node head;
	
	LinkedList(){
		this.head = null;
	}
	
	void addFirstCustomer(String name, String details) {
	    head = new Node(name, details);
	}
	
	void addCustomers(String name, String details) {
		Node newNode = new Node(name,details);
		if(head==null) {
			newNode = head;
		}
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	void removeCustomer(String customerName) {
		if(head == null) return;
		if(head.name.equals(customerName)) {
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next != null && !current.next.name.equals(customerName) ) {
			current = current.next;
		}
		if(current.next != null ) {
			current.next = current.next.next;
		}
	}
	
	void upadateCustomer(String customerName, String newDetails) {
		Node current = head;
		while(current!=null) {
			if(current.name.equals(customerName)) {
				current.details = newDetails;
				return;
			}
			current = current.next;
		}
	}
	
	void displayLinkedList() {
		Node current = head;
		
		while(current!=null) {
			System.out.println("Name : "+current.name +"\nDetails: "+current.details);
			System.out.println("");
			current = current.next;
		}
	}
	
	void addVIPCustomer(String name, String details) {
		
		Node newVIPNode = new Node(name ,details);
		newVIPNode.next = head;
		head = newVIPNode;
		
	}
}

public class LinkedListInDetail {

	public static void main(String[] args) {
		LinkedList waitlist = new LinkedList();
		
		waitlist.addFirstCustomer("Alice","Single");
		
		waitlist.addCustomers("Bob", "Single");
		waitlist.addCustomers("Smitha", "Married");
		
		waitlist.removeCustomer("alice");
		
		waitlist.upadateCustomer("Alice","Married");
		
		waitlist.addVIPCustomer("VIP Dave","Single");
		waitlist.addCustomers("Surya", "Married");
		waitlist.displayLinkedList();
		
	}

}
