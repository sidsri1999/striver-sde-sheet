
//Question Link: https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    // Approach 1
    // TC: O(n*m*(n+m) + n*m) = O(n*m*(n+m))
    // Sc: O(1)
    public void setZeroes(int[][] matrix) {
        // we know every element is either 0 , 1
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        
        // if matrix element is 0, we are making all non-zero elements as -1, in that row and col
        for(int row=0; row<totalRows; row++){
            for(int col=0; col<totalCols; col++){
                if(matrix[row][col]==0){
                    makeWholeRowMinusOne(matrix, row);
                    makeWholeColMinusOne(matrix, col);
                }
            }
        }

        // Whenever we are going to get -1, we are making as 0
        for(int row=0; row<totalRows; row++){
            for(int col=0; col<totalCols; col++){
                if(matrix[row][col]==-1)
                    matrix[row][col] = 0;
            }
        }
    }
    
    private void makeWholeRowMinusOne(int[][] matrix, int row){
        for(int col=0; col<matrix[0].length; col++){
            if(matrix[row][col]!=0)
                matrix[row][col] = -1;
        }
    }
    
    private void makeWholeColMinusOne(int[][] matrix, int col){
        for(int row=0; row<matrix.length; row++){
            if(matrix[row][col]!=0)
                matrix[row][col] = -1;
        }
    }
}