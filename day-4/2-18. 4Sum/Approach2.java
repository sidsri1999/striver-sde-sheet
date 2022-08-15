// Approach 2
// TC: O(n^3logn)
// SC: O(n)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>(); 
        Arrays.sort(nums);
        for(int i=0; i<n-3; i++){
            long target1 = target - nums[i];
            for(int j=i+1; j<n-2; j++){
                long target2 = target1 - nums[j];
                for(int k=j+1; k<n-1; k++){
                    long target3 = target2 - nums[k];
                    int index = binarySearch(nums, k+1, n-1, target3);
                    if(index!=-1){
                        set.add(Arrays.asList(new Integer[]{nums[i], nums[j], nums[k], nums[index]}));
                    }
                }
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> subList: set){
            result.add(subList);
        }
        return result;
    }
    
    private int binarySearch(int[] nums, int start, int end, long target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}