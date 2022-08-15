// Approach 1
// TC: O(n)
// SC: O(1)
class Solution {
    // Other Approaches: 
    // Using set
    // Using Map
    // Using Brute Force n^2
    // Using Sorting, comparing prev and current
    // Using Sorting and Binary Search
    // Now, Using Cycle Detection
    public int findDuplicate(int[] nums) {
        int slow = nums[0]; 
        int fast = nums[0];
        // In starting both are same, so we are using do while loop
        do{
            System.out.println("slow: "+slow);
            System.out.println("fast: "+fast);
            // move by 1
            slow = nums[slow];
            // move by 2
            fast = nums[nums[fast]];
        }while(slow!=fast);
        
        int slow1 = nums[0];
        
        while(slow1!=slow){
            slow = nums[slow];
            slow1 = nums[slow1];
        }
        return slow;
    }
}