// Approach 1
// TC: O(n)
// SC: O(1)

class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        // if n's value is negative, then its minimum is 2^31
        // and if we convert it into positive it will over flow, because positive max value is 2^31-1
        // So, we need to take for this edge case
        int abs = 1;
        if(n==Integer.MIN_VALUE){
            abs = Math.abs(n+1);
        } else {
            abs = Math.abs(n);
        }
        for(int i=1; i<=abs; i++){
            ans *= x;
        }
        if(n<0){
            if(n==Integer.MIN_VALUE)
                return 1/(ans*x);
            return 1/ans;
        }
        return ans;
    }
}