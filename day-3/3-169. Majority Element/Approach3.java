// Approach 3
// in this approach, I am going to get element with max repetetion, and we are sure we have majority element, so maximum repeating element will be our majority element
// TC: O(n)
// SC: O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int currentElement = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(count == 0){
                currentElement = nums[i];
                count = 1;
            } else if(currentElement==nums[i]){
                count++;
            } else {
                count--;
            }
        }
        return currentElement;
    }
}