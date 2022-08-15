// Approach 2
// TC: O(mlogn)
// SC: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int row=0; row<matrix.length; row++){
            if(matrix[row][0]<=target && target<=matrix[row][matrix[0].length-1]){
                return binarySearch(matrix[row], target, 0, matrix[0].length-1);
            }
        }
        return false;
    }
    
    private boolean binarySearch(int[] row, int target, int start, int end){
        //System.out.println(Arrays.toString(row));
        while(start<=end){
            int mid = start + (end-start)/2;
            if(row[mid]==target){
                return true;
            } else if(row[mid]>target){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return false;
    }
}