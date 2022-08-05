
//Question Link: https://leetcode.com/problems/next-permutation/

// Approach 1
class Solution {
    
    // TC: O(n + n + n) = O(n)
    // SC: O(1)
    public void nextPermutation(int[] nums) {
        int index1 = nums.length-2;
        
        // First Index Which is lesser as compaired to adjacent pair from right
        while(index1>=0){
            if(nums[index1]<nums[index1+1])
                break;
            index1--;
        }
        // if all are decreasing sorted, means highes number then we are going to get inside below loop
        if(index1!=-1){
            int index2 = nums.length-1;
            // find index2 whose value is greater than index1
            while(true){
                if(nums[index1]<nums[index2])
                    break;
                index2--;
            }
            // swap
            swap(nums, index1, index2);
        }
        // reverse
        reverse(nums, index1+1);
    }
    
    public void swap(int[] nums,int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
    public void reverse(int[] nums, int start){
        int last = nums.length-1;
        while(start<last){
            swap(nums, start++, last--);
        }
    }
}