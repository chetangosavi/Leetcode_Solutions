package leetcodesolutions.basics;

import java.util.Arrays;

public class ArraysInDetail {

	public static void main(String[] args) {
		/*
		 Arrays in java: An array is fixed size linear data structure that store elements of same type in single container
		 they can single dimentional or multi-Dimentional
		 
		 - indexing starts from 0
		 - Efficient Memory Management
		 - Memory Optimisation
		 - Cleaner Code
		 
		 + Syntax:
		 
		 	There are to ways to initialise arrays:
		 		1) statically
		 		2) Dynamically
		 		
		 	:Static :
		 		1) int[] arr = {1,2,3,4,5,6};
		 		
		 	:Dynamic :
		 		1) int[] arr = new int[size]; //arrays are of fixed size
		 		
		 + Accessing Array Elements :
		 
		 	1) Using Indexes:
		 			int[] numbers = {1,2,3,4,5};
		 			accessing first number : arr[0]
		 			accessing last number: arr[arr.length-1]
		 			
		 	2) Looping Through array 
		 		- using for loop
		 		
		 + Operations on arrays:
		 
		 	1. Traversal
		 	2. Insertion
		 	3. Deletion
		 	
		 	Traversal : it is a process of going through each element one by one
		 		- using for loop
		 		int[] marks = {30,36,45,48,49,50};
		 		for(int i=0;i<marks.length;i++){
		 			sysout((i+1)+": MARKS"+mark[i]);
		 		}
		 		
		 	Insertion : It is a process of adding new element at specific index
		 		insertion can be done in two ways
		 		- changing or inerting element in fixed size array
		 			marks[3] = 46;
		 			
		 		- changing size of array to accomodate new element
		 		
		 		int[] marksUpdated = new int[7];
		 		for(int i=0;i<marksUpdated.length;i++){
		 		 		if(i==updatedMarks.length-1){
		 		 			updatedMarks[i] = marks[i];
		 		 		}
		 		 		else{
		 		 			updatedMarks[i] = marks[i];
		 		 		}
		 		 	}
		 		 	
		 	Deletion : Removal of element from array
		 	 			num[1] = null;
		 	 
		 	 Note   - Traditional arrays are not dynamically resizeable
		 	 		- Insertion and deletion in array requires extra memory
		 	 		- Deleting or replacing value with null in arrays is waste of memory as size of array remains unchanged
		 	 		                                   /
		 	 		     this can lead to null pointer exception
		 	 		
		 	
		 */
		
		//Static Initialisation
		//String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		//Dynamic Initialisation:
		
		//Exercise 1:
		String[] daysOfWeek = new String[7];
		String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		for(int i=0; i< days.length;i++) {
			daysOfWeek[i] = days[i];
			System.out.println("Day "+(i+1)+" : "+days[i]);
		}
		
		for(String day : days) {
			System.out.println(day);
		}
		
		System.out.println(Arrays.toString(daysOfWeek));
		
		//Exercise 2:
		String[] monthOfYear = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
			for(int i=0; i < monthOfYear.length;i++) {
				if(i%2==0 && i != 1) {
				 System.out.println(monthOfYear[i]+": 31");
				}
				else if(monthOfYear[i]=="February") {
					System.out.println(monthOfYear[i]+": 28");
				}
				else {
					System.out.println(monthOfYear[i]+": 30");
				}
	
	}

	}

}
