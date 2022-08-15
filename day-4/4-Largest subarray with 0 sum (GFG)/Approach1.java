// Approach 1
// TC: O(n^2)
// SC: O(1)
class GfG
{
    int maxLen(int arr[], int n)
    {
        int maxLength = 0;
        for(int i=0; i<arr.length; i++){
            int currentCount = 0;
            for(int j=i; j<arr.length; j++){
                currentCount += arr[j];
                if(currentCount==0)
                    maxLength = Math.max(maxLength, j-i+1);
            }
        }
        return maxLength;
    }
}