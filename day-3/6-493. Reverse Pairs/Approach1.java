// Approach1
// Brute Force
// TC: O(n*n)
// SC: O(1)
class Solution {
    
    public int reversePairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]%2==0){
                    if(nums[i]/2>nums[j])
                        count++;
                } else {
                    if(nums[i]/2+1>nums[j])
                        count++;
                }
            }
        }
        return count;
    }
    
}