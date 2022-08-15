// Approach 3
// Combinatorics
// TC = O(m*n)
// SC = O(m*n)
class Solution {
    Integer[][] dp = null;
    public int uniquePaths(int m, int n) {
        // Suppose if m = 3, and n =7
        // The robot have to perform 6 Right Moves
        // The robot have to perform 2 Down Moves
        // The moves can be in any order but the total moves will be 6 R and 2 D
        // So, We can say either we can choose 6 Right Moves out of 8 moves, or 2 D moves out of 8 moves
        // i.e. either we can calculate 8C6 OR 8C2, i.e. nCr
        int totalMoves = m-1 + n-1;
        int rightMoves = m-1;
        return performCombination(totalMoves, rightMoves);
    }
    
    private int performCombination(int n, int r){
        System.out.println(n+" : "+r);
        double res = 1;
        for (int i = 1; i <= r; i++){
            //System.out.println("**"+(n-r+i));
            res = res * (n - r + i) / i;
        }
        return (int)res;
    }
}

// nCr = n! / ( r! * (n-r)! )
// 8C6 = 8! / ( 6! * 2! ) =  (8 * 7) / (1 * 2) 