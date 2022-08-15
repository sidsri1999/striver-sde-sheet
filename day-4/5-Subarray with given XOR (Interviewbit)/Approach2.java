// Approach 2
// TC: O(n)
// SC: O(1)
public class Solution {
    public int solve(int[] A, int B) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int prefixXor = 0;
        for(int i=0; i<A.length; i++){
            prefixXor ^= A[i];
            if(prefixXor==B)
                count++;
            int Y = prefixXor^B;
            if(map.containsKey(Y)){
                count += map.get(Y);
            }
            map.put(prefixXor, map.getOrDefault(prefixXor,0)+1);
        }
        return count;
    }
}