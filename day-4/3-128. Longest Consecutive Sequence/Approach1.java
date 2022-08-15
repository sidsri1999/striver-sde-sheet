// Approach 1
// TC : O(nlogn)
// SC : O(1)
class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 1;
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int i = 1;
        int currentLength = 1;
        while(i<nums.length){
            if(nums[i-1]+1==nums[i]){
                currentLength++;
                // to ignore same element
                // [1,2,0,1]
            } else if(nums[i-1]+1 < nums[i]) {
                if(maxLength<currentLength)
                    maxLength = currentLength;
                currentLength = 1;
            }
            i++;
        }
        if(maxLength<currentLength)
            maxLength = currentLength;
        return maxLength;
    }
}