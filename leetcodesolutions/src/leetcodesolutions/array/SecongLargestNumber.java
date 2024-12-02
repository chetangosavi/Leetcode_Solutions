package leetcodesolutions.array;

public class SecongLargestNumber {

	public static void main(String[] args) {
		int[] nums = {12, 35, 1, 10, 34, 1};
		int n = nums.length;
        int max = 0;
        int secMax = 0;
        
        //calculating max in the array
        for(int i = 0; i < n; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        for(int i = 0; i<n;i++) {
        	if(nums[i]>secMax && nums[i]!= max) {
        		secMax = nums[i];
        	}
        }
        System.out.println(secMax);
        System.out.println(max);
	}

}
