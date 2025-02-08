package leetcodesolutions.array;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
	
		int target = 6;
		int[] nums = {3,2,3};
		
		//Brute Force Approach: TC: O(n2) SPC:O(1)
		int[] ans = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]== target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
        

	}

}
