// Approach 1
// SC : O(n^4)
// TC : O(n)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        if(n<4){
            return list;
        }
        Set<List<Integer>> set = new HashSet<>();
        for(int a=0; a<n-3; a++){
            for(int b=a+1; b<n-2; b++){
                for(int c=b+1; c<n-1; c++){
                    for(int d=c+1; d<n; d++){
                        //System.out.println(a+" : "+b+" : "+c+" : "+d);
                        if(nums[a] + nums[b] + nums[c] + nums[d] == target){
                            Integer[] quadruple = new Integer[]{nums[a],nums[b],nums[c],nums[d]};
                            Arrays.sort(quadruple);
                            set.add(Arrays.asList(quadruple));
                        }
                    }
                }
            }
        }
        for(List<Integer> subList : set){
            list.add(subList);
        }
        return list;
    }
}