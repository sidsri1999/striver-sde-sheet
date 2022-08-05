// Question Link: https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    // Approach 2
    // TC: O(n*m + n*m) = O(n*m)
    // Sc: O(n+m)
    public void setZeroes(int[][] matrix) {
        
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        
        // This will hold which row contain any 0, initially all zero in this array, and if we found 0 in any where we are updating that row index here as 1
        int isRowZero[] = new int[totalRows];
        int isColZero[] = new int[totalCols];
        
        for(int row=0; row<totalRows; row++){
            for(int col=0; col<totalCols; col++){
                if(matrix[row][col]==0){
                    isRowZero[row] = 1;
                    isColZero[col] = 1;
                }
            }
        }

        // we are checking in our array, if that row or col is zero we are making that index as zero
        for(int row=0; row<totalRows; row++){
            for(int col=0; col<totalCols; col++){
                if(isRowZero[row]==1 || isColZero[col]==1)
                    matrix[row][col] = 0;
            }
        }
    }
    
}