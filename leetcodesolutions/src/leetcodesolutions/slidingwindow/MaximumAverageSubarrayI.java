package leetcodesolutions.slidingwindow;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        //double avg = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxsum = sum;
        int startIdx = 0;
        int endIdx = k;

        while (endIdx < n) {
            sum -= nums[startIdx];
            startIdx++;

            sum += nums[endIdx];
            endIdx++;

            maxsum = Math.max(maxsum, sum);
        }

        return maxsum / (double) k;
    }
}

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        Solution solution = new Solution();
        double result = solution.findMaxAverage(nums, k);

        System.out.println("The maximum average is: " + result);
    }
}

