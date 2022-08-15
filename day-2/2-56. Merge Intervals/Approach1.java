
//Question Link: https://leetcode.com/problems/merge-intervals/

// Approach 1
// TC: O(n)
// SC: O(n)
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        // Ascending order based on first element in each sub array
        Arrays.sort(intervals, (int[] a, int[] b) -> a[0]- b[0]);
        int[] currentInterval = intervals[0];
        for(int i=1; i<intervals.length; i++){
            if((intervals[i][0] - currentInterval[1])>0 ){
                list.add(currentInterval);
                currentInterval = intervals[i];
            } else{
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            }
        }
        list.add(currentInterval);
        int[][] response = new int[list.size()][];
        int i=0;
        for(int[] arr: list){
            // System.out.println(Arrays.toString(arr));
            response[i++] = arr;
        }
        return response;
    }
}