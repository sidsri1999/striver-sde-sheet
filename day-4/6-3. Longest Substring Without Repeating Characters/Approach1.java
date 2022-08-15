// Approach 1
// TC: O(n^2)
// SC: O(n)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set;
        int maxLength = 0;
        for(int i=0; i<s.length(); i++){
            set = new HashSet<>();
            int currentLength = 0;
            for(int j=i; j<s.length(); j++){
                if(set.contains(s.charAt(j))){
                    break;
                } else {
                    set.add(s.charAt(j));
                    currentLength++;
                }
            }
            if(currentLength>maxLength)
                maxLength = currentLength;
        }
        return maxLength;
    }
}