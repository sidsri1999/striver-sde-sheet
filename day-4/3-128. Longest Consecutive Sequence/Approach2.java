// Approach 2
// TC : O(n)
// SC : O(n)
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;
        for(int num : nums)
            set.add(num);
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int currentLength = 0;
                int num = nums[i];
                while(set.contains(num++)){
                  currentLength++;  
                }
                if(maxLength<currentLength)
                    maxLength = currentLength;
            }
        }
        return maxLength;
    }
}