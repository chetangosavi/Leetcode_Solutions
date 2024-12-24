package leetcodesolutions.basics;

public class CollectionFramework {

	public static void main(String[] args) {
		/*
		  Collection Framework:
		  	The Collection interface in Java is a core member of the Java Collections Framework located in the java.util package. 
		  	It is one of the root interfaces of the Java Collection Hierarchy. The Collection interface is not directly implemented 
		  	by any class. Instead, it is implemented indirectly through its sub-interfaces like List, Queue, and Set.
		  	
		  				Collection
		  					|
		  	________________|_______________________
		   |                   |                    |   					 
		  List                Set                  Queue					
		  
		  -ArrayList        -HashSet			- priorityQueue				
		  -LinkedList		-TreeSet			- Dequeue					
		  -Vector			-LinkedHashSet									
		  -Stack
		  
		  Sub-Interfaces of Collection Interface
			The subInterfaces are sometimes called as Collection Types or SubTypes of Collection. These include the following:
			
			1. List
			The List interface represents an ordered collection that allows duplicates. It is implemented by classes 
			like ArrayList, LinkedList, and Vector. Lists allow elements to be accessed by their index position.
			
			
			2. Set
			A set is an unordered collection of objects in which duplicate values cannot be stored. 
			This set interface is implemented by various classes like HashSet, TreeSet, LinkedHashSet, etc.
			
			
			3. SortedSet
			This interface is very similar to the set interface. The only difference is that this interface 
			has extra methods that maintain the ordering of the elements. The sorted set interface extends the set interface and is used to handle the data which needs to be sorted. The class which implements this interface is TreeSet.
			
			
			4. Queue
			The Queue interface represents a collection that follows FIFO (First-In-First-Out) order. It is implemented 
			by classes like PriorityQueue, Deque, ArrayDeque, etc.
			
			
			Map :
				Map interface is a part of Java Collection Framework, but it doesn't inherit Collection Interface. A Map cannot contain 
				duplicate keys: Each key can map to at most one value.
				
				- HashMap
				- TreeMap
				- LinkedHashMap

		 */

	}

}
