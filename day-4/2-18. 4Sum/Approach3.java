// Approach 2
// TC: O(n^3)
// SC: O(1)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-3; i++){
            long target1 = target - nums[i];
            for(int j=i+1; j<n-2; j++){
                long target2 = target1 - nums[j];
                int start = j+1;
                int end = n-1;
                while(start<end){
                    long twoSum = nums[start]+nums[end];
                    if(twoSum<target2){
                        start++;
                        while(start<=end && nums[start-1]==nums[start])
                            start++;
                    } else if(twoSum>target2){
                        end--;
                        while(start<=end && nums[end+1]==nums[end])
                            end--;
                    } else {
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[start]);
                        quad.add(nums[end]);
                        ans.add(quad);
                        start++;
                        end--;
                        while(start<=end && nums[start-1]==nums[start])
                            start++;
                        while(start<=end && nums[end+1]==nums[end])
                            end--;
                    }
                }
                while(j+1<n-2 && nums[j+1]==nums[j])
                    j++;
            }
            while(i+1<n-3 && nums[i+1]==nums[i])
                i++;
        }
        return ans;
    }
}