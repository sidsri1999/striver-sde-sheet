
//Question Link: https://leetcode.com/problems/rotate-image/

class Solution {
    // Brute Force
    // TC: O(n*n)
    // SC: O(n*n)
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] newMatrix = new int[n][n];
        // int last col
        int col = n-1;
        // taking 1st row, putting at last col, row++ and col-- and so on
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                newMatrix[j][col] = matrix[i][j];
            }
            col--;
        }
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = newMatrix[i][j];
            }
        }
    }
}