// Approach 2
// Sorting and Two pointer
// TC: O(nlogn) + O(n) + O(n) = O(nlogn)
// SC: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] nums1 = new int[nums.length];
        for(int i=0; i<nums.length; i++)
            nums1[i] = nums[i];
        Arrays.sort(nums1);
        int left = 0, right = nums1.length-1;
        int num1 = 0, num2 = 0;
        while(left<right){
            //System.out.println(left+" : "+right);
            int sum = nums1[left]+nums1[right];
            if(sum==target){
                num1 = nums1[left];
                num2 = nums1[right];
                break;
            }
            if(sum<target){
                left++;
            } else {
                right--;
            }
        }
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            if(nums[i] == num1 && ans[0]==0){
                ans[0] = i;
            } else if(nums[i] == num2){
                ans[1] = i;
            }
        }
        return ans;
    }
}