// Approach 2
// DP
// TC = O(m*n)
// SC = O(m*n) + O(m*n) = O(m*n)
class Solution {
    Integer[][] dp = null;
    public int uniquePaths(int m, int n) {
        dp  = new Integer[m][n];
        return possiblePaths(0,0,m,n);
    }
    
    private int possiblePaths(int currentRow, int currentCol, int m, int n){
        if(currentRow>=m || currentCol>=n){
            return 0;
        }
        if(currentRow==m-1 || currentCol==n-1){
            return 1;
        }
        if(dp[currentRow][currentCol]!=null)
            return dp[currentRow][currentCol];
        dp[currentRow][currentCol] = possiblePaths(currentRow+1, currentCol, m, n)+ possiblePaths(currentRow, currentCol+1, m, n);
        return dp[currentRow][currentCol];
    }
}