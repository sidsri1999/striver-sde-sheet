
//Question Link: https://leetcode.com/problems/pascals-triangle/

// Approach 1
class Solution {
    
    // TC: O(n!)
    // SC: O(n!)
    // Where n is number of rows
    public List<List<Integer>> generate(int numRows) {
        // Response Array
        List<List<Integer>> response = new ArrayList<>();
        // Pointing to current row
        List<Integer> currentRow = null;
        // Pointing to prev row
        List<Integer> prevRow = null;
        
        // for each row
        for(int rowNumber=0; rowNumber<numRows; rowNumber++){
            // making a new list for current row
            currentRow = new ArrayList<>();
            // adding elements to current row
            for(int element=0; element<=rowNumber; element++){
                // In current row, first and last element should be 1
                if(element==0 || element==rowNumber){
                    currentRow.add(1);
                // else we need to add ith and i-1th element of prev row
                } else {
                    currentRow.add(prevRow.get(element-1)+prevRow.get(element));
                }
            }
            // add that row in our response
            response.add(currentRow);
            // now prev row will point to current row, for upcoming row
            prevRow = currentRow;
        }
        // return response
        return response;
    }
}