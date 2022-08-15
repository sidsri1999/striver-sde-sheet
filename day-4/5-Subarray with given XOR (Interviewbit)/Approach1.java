// Approach 1
// TC: O(n^2)
// SC: O(1)
public class Solution {
    public int solve(int[] A, int B) {
        int count = 0;
        for(int i=0; i<A.length; i++){
            int xor = 0;
            for(int j=i; j<A.length; j++){
                xor ^= A[j];
                if(xor==B)
                    count++;
            }
        }
        return count;
    }
}