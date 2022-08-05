class Solution {
    // Approach 3:  Taken From Pepcoding: https://www.youtube.com/watch?v=zgaOU5aInOc
    // TC: O(n*m + n*m + n*m + n + m) = O(n*m)
    // Sc: O(1)
    public void setZeroes(int[][] matrix) {
        
        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;
        
        // We are checking if any first row element is 0 or not
        for(int col=0; col<matrix[0].length; col++){
            if(matrix[0][col]==0){
                isFirstRowZero = true;
                break;
            }
        }
        
        // We are checking if any first col element is 0 or not
        for(int row=0; row<matrix.length; row++){
            if(matrix[row][0]==0){
                isFirstColZero = true;
                break;
            }
        }
        
        // Now, we have taken first row and col as a reference to hold whethere that whole row or col is zero or not
        for(int row=1; row<matrix.length; row++){
            for(int col=1; col<matrix[0].length; col++){
                if(matrix[row][col]==0){
                    matrix[0][col] = 0;
                    matrix[row][0] = 0;
                }
            }
        }
        
        for(int row=1; row<matrix.length; row++){
            if(matrix[row][0]==0){
                for(int col=0; col<matrix[0].length; col++){
                    matrix[row][col]=0;
                }
            }
        }
        
        for(int col=1; col<matrix[0].length; col++){
            if(matrix[0][col]==0){
                for(int row=0; row<matrix.length; row++){
                    matrix[row][col]=0;
                }
            }
        }

        if(isFirstRowZero){
            for(int col=0; col<matrix[0].length; col++){
                matrix[0][col] = 0;
            }
        }
        
        if(isFirstColZero){
            for(int row=0; row<matrix.length; row++)
                matrix[row][0] = 0;
        }
        
    }
    
}