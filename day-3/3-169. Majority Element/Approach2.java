// Approach 2
// Counting Each Element
// TC: O(n)
// SC: O(n)
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = nums.length/2;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num)>min)
                return num;
        }
        return -1;
    }
}