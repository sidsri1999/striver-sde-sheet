// Approach 1
// TC: Exponential
// SC: Exponential
class Solution {
    public int uniquePaths(int m, int n) {
        return possiblePaths(0,0,m,n);
    }
    
    private int possiblePaths(int currentRow, int currentCol, int m, int n){
        if(currentRow>=m || currentCol>=n){
            return 0;
        }
        if(currentRow==m-1 || currentCol==n-1){
            return 1;
        }
        return possiblePaths(currentRow+1, currentCol, m, n)+ possiblePaths(currentRow, currentCol+1, m, n);
    }
}