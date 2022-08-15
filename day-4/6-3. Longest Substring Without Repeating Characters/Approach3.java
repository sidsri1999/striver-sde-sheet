// Approach 3
// sliding window with hashmap
// TC: O(n)
// SC: O(n)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int n = s.length();
        int start = 0, end = 0;
        // Storing character and its last index
        Map<Character, Integer> map = new HashMap<>();
        while(end<n){
            if(map.containsKey(s.charAt(end)))
                // Want to understand below line dry run for abba
                start = Math.max(map.get(s.charAt(end)) + 1, start);
            map.put(s.charAt(end), end);
            if(maxLength<(end-start+1))
                maxLength = end-start+1;
            end++;
        }
        return maxLength;
    }
}