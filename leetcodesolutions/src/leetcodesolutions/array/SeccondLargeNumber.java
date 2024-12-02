package leetcodesolutions.array;

public class SeccondLargeNumber {

	public static void main(String[] args) {
		int[] nums = {12, 35, 1, 10, 33, 35};
		int n = nums.length;
        int max = -1;
        int prev = -1;
        
        for(int i = 0; i<n; i++) {
        	if(nums[i]>max) {
        		prev = max;
        		max = nums[i];
        	}
        	if(nums[i]>prev && nums[i]<max) {
        		prev = nums[i];
        	}
        }
        System.out.println(prev);
	}

}
