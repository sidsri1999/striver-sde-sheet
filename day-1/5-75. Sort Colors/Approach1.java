
//Question Link: https://leetcode.com/problems/maximum-subarray/

// Approach 1
// TC: O(n*n)
// SC: O(1)
class Solution {
    // Brute Force
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int maxFromI = nums[i];
            int totalSum = nums[i];
            for(int j=i+1; j<nums.length; j++){
                totalSum += nums[j];
                if(maxFromI<totalSum){
                    maxFromI = totalSum;
                }
            }
            if(max<maxFromI){
                max = maxFromI;
            }
        }
        return max;
    }
}