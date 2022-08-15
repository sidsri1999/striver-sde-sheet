// Approach 2
// if x^n = (x*x)^(n/2)
// TC: O(logn)
// SC: O(n)
class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            if(n==Integer.MIN_VALUE)
                return 1/calculatePow(x, Math.abs(n+1))/x;
            return 1/calculatePow(x, Math.abs(n));
        }
        return calculatePow(x, n);
    }
    
    private double calculatePow(double x, int n){
        if(n==0)
            return 1;
        if(n%2==0)
            return calculatePow(x*x, n/2);
        return x*calculatePow(x*x, n/2);
    }
}

// 2^10 = (2*2)^5 = 4^5
// 4^5 = 4*(4*4)^2 = 4*(16^2)
// 16^2 = (16*16)^1 = (256)^1
// 256^1 = 256*(256*256)^0 = 256 // Now return to above call
// 256*4 = 1024