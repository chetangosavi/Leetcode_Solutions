package leetcodesolutions.basics;

public class TimeAndSpaceComplexity {

	public static void main(String[] args) {
		//Time and space complexity;
		/*
		 * LINKS(Resource) :
		 * 	1) https://www.youtube.com/watch?v=pULw1Fpru0E (NESO)
		 * 	2) https://www.youtube.com/watch?v=9TlHvipP5yA (Abdul Bari sir)
		 * 
		 * how to estimation of time and memory space ?
		 * 
		 * 1) priory and posteriori analysis
		 * - priory : checks before execution on system
		 * - posteriori : checks after execution on system
		 * 
		 * 2) CPU computation : refers to task performed by CPU or instructions executed by CPU
		 * 	  Main memory space : a temporary storage used to store information that CPU needs while execution
		 * 		of program (RAM)
		 * 
		 * Time Complexity :
		 * 		Estimation of total cpu computations required to execute algoritham
		 * 
		 *  Time Complexity = Sum of total cpu computations = sum of frequency count of each instruction of an
		 *  algoritham
		 * 
		 */

		//Exmaple
		int[] nums = {1,2,3,4,5,6};                 //1 Unit
		int sum = 0;                                //1 Unit
		for(int i=0;i<nums.length;i++) {    //int i = 0 - 1 unit && nums.length - n+1 times && i++ - n times
			sum+=nums[i];                  //this for loop runs for n - Units
		}
		System.out.println(sum);   // 1Unit
		
		//there for time complexity  1 + 1 + 1 + n + 1 + n + n + 1 = O(n)
		//space complexity O(n) 
		
		/*
		 * nums = n
		 * sum = 1     n + 1 = O(n)
		 */
 	}

}
