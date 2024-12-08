package leetcodesolutions.basics;

public class SelectionSort {

	public static void main(String[] args) {
		/*
		 	Selection Sort:
		 		Selection Sort is a simple sorting algorithm that repeatedly selects the smallest 
		 		(or largest) element from an unsorted part of the list and places it in its correct 
		 		position. It’s an in-place sorting algorithm (it doesn’t require extra space) but has 
		 		a time complexity of O(n²), making it less efficient for large datasets.
		 		
		 	Time Complexity = O(n²)
		 		
		 	How Selection Sort Works:
				1. Find the smallest element in the unsorted part of the array.
				2. Swap it with the first element of the unsorted part.
				3. Move the boundary of the sorted part to the right.
				4. Repeat steps 1-3 until the entire array is sorted.
				
			Visual Example:
				Unsorted Array: [64, 25, 12, 22, 11]
				
				Pass 1: Smallest = 11 → Swap with 64 → [11, 25, 12, 22, 64]
				Pass 2: Smallest = 12 → Swap with 25 → [11, 12, 25, 22, 64]
				Pass 3: Smallest = 22 → Swap with 25 → [11, 12, 22, 25, 64]
				Pass 4: No need to swap, as 25 and 64 are in the correct position.
				
				Sorted Array: [11, 12, 22, 25, 64]
		 		
		 		
		 */
		
		int[] arr = {64, 25, 12, 22, 11};
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++){
			int minIndex = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
