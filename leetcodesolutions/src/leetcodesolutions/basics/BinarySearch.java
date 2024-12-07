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
				
				/*
				  To avoid integer overflow:
				  			
				  	left + (right - left)/2 formula is used
				  			bec  while int value is close to Integer_MAX and if we try to add them directly
				  			integer will overflow so to avoid that this formula is used
				  	
				  	
				  	DRY RUN :
				  	                     0 1 2 3 4 5 6 7 
				  			int[] arr = {1,2,3,4,5,6,7,8};
				  			int target = 5
				  			n = 8;
				  			left = 0;
				  			right = n-1;  8-1 = 7
				  			IT - 1 :
				  				(left+right)/2 ;
				  				int mid  = (7+0)/2 => 7/2 => 3
				  				
				  				arr[mid] == target ? arr[3] == 5 ? 4 == 5 ? no 
				  				arr[mid] < target ? 4 < 5 => yes
				  				left = mid + 1 = 3 + 1 = 4
				  				
				  			IT - 2:
				  				left = 4  right = 7
				  				
				  				mid = (7+4)/2 = 11 / 2 = 5
				  				arr[5] == target ? 6 == 5 ? no
				  				arr[5]<target => 6 < 5 ? no
				  				right = mid - 1 = 5 - 1 = 4
				  				
				  			IT - 3:
				  			
				  				right = 4 left = 4
				  				mid = 4
				  				arr[mid] == target ? arr[4] == 5 ? 5 == 5 ? true;
				  				return mid;
				  				output : 4
				  				
				  		In case we use :
				  		
				  			left + (Right - left)/2
				  			 result for iteration 2 : lets cross check and understand
				  			 
				  			 4 + (7-4)/2
				  			 4 + 3/2 = 4 + 1 = 5  
				  			
				 */
  }

}
