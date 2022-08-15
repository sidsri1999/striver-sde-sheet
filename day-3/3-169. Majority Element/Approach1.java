// Approach1
// Sort The array, then n/2 index will always be majority element, we are sure that arr will contain majority element
// SC: O(nlogn)
// TC: O(1)

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int half = nums.length/2;
        return nums[half];
    }
}