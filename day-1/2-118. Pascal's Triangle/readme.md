
# 118. Pascal's Triangle


## Question Link

[Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)

## Help

- [Self](#): Approach1
- [Striver](https://github.com/striver79/SDESheet/blob/main/pascalTriangleJava): Approach1



## Approach1

- Create an list of list

- For each row, if the element is first or last of row mark as 1, or add (i-1)th and ith element of prevRow for ith element of current row.

- Each time add that row to response row

- Time Complexity: O(n!)

- Space Complexity: O(n!)
