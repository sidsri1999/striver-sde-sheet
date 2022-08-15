// Approach 1
// TC: O(m+n)
// SC: O(m+n)
class Solution {
    
    // With using extra space
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[n+m];
        int nums1Index = 0;
        int nums2Index = 0;
        int current = 0;
        
        while(nums1Index<m && nums2Index<n){
            if(nums1[nums1Index]<=nums2[nums2Index]){
                temp[current++] = nums1[nums1Index++];
            }else{
                temp[current++] = nums2[nums2Index++];
            }
        }
        
        // Left Elements in nums1
        while(nums1Index<m){
            temp[current++] = nums1[nums1Index++];
        }
        
        // Left Elements in nums2
        while(nums2Index<n){
            temp[current++] = nums2[nums2Index++];
        }
        
        // Putting back to nums1 array
        for(int i=0; i<nums1.length; i++){
            nums1[i] = temp[i];
        }
    }
}