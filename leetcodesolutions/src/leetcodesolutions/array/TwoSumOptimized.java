package leetcodesolutions.array;
import java.util.*;

public class TwoSumOptimized {

	public static int[] twoSum(int[] nums,int target) {
		Map<Integer,Integer> ans = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int complement = target-nums[i];
			if(ans.containsKey(complement)) {
				return new int[] {ans.get(complement),i};
			}
			ans.put(nums[i], i);
		}
		return new int[]{};
		
	}
	public static void main(String[] args) {
		int target = 6;
		int[] nums = {3,2,3};
		System.out.println(Arrays.toString(twoSum(nums,target)));

	}

}
