package leetcodesolutions.basics;

public class BinarySearch {

	public static void main(String[] args) {
		/*
		 	Binary Search: 
		 		Biinary Search is an efficient algorithm 
		 		to find the position of a target element in a sorted array. 
		 		It works by repeatedly dividing the search interval in half.
		 		
		 	How Binary Search Works:
				1) Start with two pointers: low (beginning of the array) and high (end of the array).
				2) Find the middle element: mid = (low + high) / 2.
				3) Check the middle element:
				   1) If arr[mid] is the target, you've found it!
				   2) If arr[mid] is greater than the target, search the left half (high = mid - 1).
				   3) If arr[mid] is less than the target, search the right half (low = mid + 1).
				4) Repeat steps 2-3 until low becomes greater than high.
		 */

	int[] arr = {1,2,3,4,5,6,7,8,9};
	int n = arr.length;
	int target = 4;
	int left = 0;
	int right = n-1;
	
	while(left<=right) {
		int mid =(left + right)/2;
		if(arr[mid] == target) {
			System.out.println(mid);
			return;
		}
		if(arr[mid]<target) {
			left = mid+1;
		}
		else {
			right = mid-1;
		}
	}
	
	System.out.println(-1);
  }

}
