// Approach 2
// TC: O(m+n)
// SC: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int currentIndex = m+n-1;
        m--;    // assuming index
        n--;    // assuming index
        while(n>=0  && m>=0){
            if(nums2[n]>nums1[m]){
                nums1[currentIndex--] = nums2[n--]; 
            } else{
                nums1[currentIndex--] = nums1[m--];
            }
        }
        while(m>=0){
            nums1[currentIndex--] = nums1[m--]; 
        }
        while(n>=0){
            nums1[currentIndex--] = nums2[n--]; 
        }
    }
}