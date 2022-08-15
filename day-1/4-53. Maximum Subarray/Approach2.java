
//Question Link: https://leetcode.com/problems/maximum-subarray/

// Approach 2
// TC: O(n)
// SC: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSumTillNow = nums[0];
        for(int i=1; i<nums.length; i++){
            currentSum = Math.max(currentSum+nums[i], nums[i]);
            maxSumTillNow = Math.max(maxSumTillNow, currentSum);
        }
        return maxSumTillNow;
    }
}