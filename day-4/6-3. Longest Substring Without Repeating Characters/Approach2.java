// Approach 2
// sliding window 
// TC: O(2n)
// SC: O(n)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int n = s.length();
        int start = 0, end = 0;
        int currentLength = 0;
        Set<Character> set = new HashSet<>();
        while(end<n){
            if(set.contains(s.charAt(end))){
                if(maxLength<currentLength)
                    maxLength = currentLength;
                set.remove(s.charAt(start++));
                currentLength--;
            } else {
                set.add(s.charAt(end++));
                currentLength++;
            }
        }
        if(maxLength<currentLength)
                    maxLength = currentLength;
        return maxLength;
    }
}