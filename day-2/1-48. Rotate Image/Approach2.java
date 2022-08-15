
//Question Link: https://leetcode.com/problems/rotate-image/

class Solution {
    // Approach2 
    // TC: O(n*n + n*n) = O(n*n)
    // SC: O(1)
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        transpose(matrix, n);
        reverseEachRow(matrix, n);
    }
    
    public void transpose(int[][] matrix, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                swapMatrixElement(matrix, i, j);
            }      
        }
    }
    
    private void swapMatrixElement(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    
    private void reverseEachRow(int[][] matrix, int n){
        for(int row=0; row<n; row++){
            reverseArray(matrix[row], n);
        }
    }
    
    private void reverseArray(int[] row, int n){
        int start = 0;
        int end = n-1;
        while(start<end){
            swap(row, start++, end--);
        }
    }
    
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}