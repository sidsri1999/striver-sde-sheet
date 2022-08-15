// Approach 2
// TC: O(n)
// SC: O(n)
class GfG
{
    int maxLen(int arr[], int n)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;
        for(int i=0; i<n; i++){
            prefixSum += arr[i];
            if(prefixSum==0){ 
                maxLength = i+1;
            } else {
                if(map.containsKey(prefixSum)){
                    maxLength = Math.max(maxLength, i-map.get(prefixSum));
                } else {
                    map.put(prefixSum, i);
                }
            }
        }
        //System.out.println(map);
        return maxLength;
    }
}