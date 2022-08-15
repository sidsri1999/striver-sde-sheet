// Approach 2
// Extended Boyer Moore’s Voting Algorithm
// TC : O(n)
// SC : O(n)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int firstElement = 0, firstCount = 0;
        int secondElement = 0, secondCount = 0;
        for(int i=0; i<nums.length; i++){
            if(firstElement == nums[i]){
                firstCount++;
            } else if (secondElement == nums[i]){
                secondCount++;
            } else if(firstCount == 0){
                firstElement = nums[i];
                firstCount = 1;
            } else if(secondCount == 0){
                secondElement = nums[i];
                secondCount = 1;
            } else {
                firstCount--;
                secondCount--;
            }
            // System.out.println(firstElement+" - "+secondElement);
        }
        // System.out.println(firstElement+" - "+secondElement);
        // Now first and second element will be highest repeating elements, but we need to make sure that its occurrence more than n/3
        int min = nums.length/3;
        firstCount = 0;
        secondCount = 0;
        for(int num : nums){
            if(firstElement==num){
                firstCount++;
            } else if(secondElement==num){
                secondCount++;
            }
        }
        if(firstCount>min){
            list.add(firstElement);
        }
        if(secondCount>min){
            list.add(secondElement);
        }
        return list;
    }
}