// Approach 1
// Count Occurrence for each compare with n/3
// return the valid response
// TC: O(n) + O(n) = O(n)
// SC: O(n) + O(n) = O(n)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();
        int min = nums.length/3;
        for(int num: nums){
            counts.put(num, counts.getOrDefault(num,0)+1);
        }
        //System.out.println(counts);
        for(Map.Entry<Integer, Integer> count : counts.entrySet()){
            if(count.getValue()>min){
                list.add(count.getKey());
            }
        }
        return list;
    }
}