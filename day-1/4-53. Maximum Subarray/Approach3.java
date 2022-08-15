
//Question Link: https://leetcode.com/problems/maximum-subarray/

// Kadane's Algorithm
// Approach 3
// TC : O(n)
// SC : O(1)
class Solution {
    
    
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for(int i =0; i<nums.length; i++){
            sum += nums[i];
            // If sum is greater than max, put it to max
            if(max<sum)
                max = sum;
            // If sum is less than 0, it is of no use to take -ve value furthur
            if(sum<0)
                sum = 0;
        }
        return max;
    }
}