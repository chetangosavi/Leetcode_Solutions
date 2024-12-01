package leetcodesolutions.bitmanipulation;

public class SingleNumber {

	class Solution {
        public int singleNumber(int[] nums) {
            int value = 0;
            for(int i =0 ; i<nums.length;i++){
                value = value^nums[i];                 //XOR Operation
            } 
            return value;
        }
    }
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        SingleNumber s = new SingleNumber();
        Solution sol = s.new Solution();
        int singleNum = sol.singleNumber(nums);
        System.out.println("Single Number is: "+singleNum);
    }

}
