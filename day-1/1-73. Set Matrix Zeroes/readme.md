
# 73. Set Matrix Zeroes


## Question Link

[Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)

## Help

- [take U forward](https://www.youtube.com/watch?v=M65xBewcqcI): Approach1 & Approach2
- [pepcoding](https://www.youtube.com/watch?v=zgaOU5aInOc): Approach3



## Approach1

- Set all non zero Elements in the whole row and col to -1, if we encounter any zero.

- Traverse again matrix marking each -1 to 0

- Time Complexity: O(n * m * (n+m) + n * m) = O(n * m * (n+m))

- Space Complexity: O(1)


## Approach2

- Take two arrays of size totalRows and totalColumns

- Traverse each element if 0, then we set the newly created row to 1 and that col 1

- Now, again we traverse the array and we check in that newly created row and col array, if any of them is 1, we will mark that cell as 0

- Time Complexity: O(n * m + n * m) = O(n * m)

- Space Complexity: O(n + m)


## Approach3

- Instead of taking two arrays, we will assume first row and first col, that will hold the data, whether that row is going to be zero or not

- So, before modifying first row and col, we will check whether that first row or col is having any 0, if yes at last we are going to make that row or col as 0

- Now, we will mark first row or col cell as zero if we check from second row and col.

- Now, we will check first row, if any element is 0, we mark whole row as 0, similarly check columns.

- Time Complexity: TC: O(n * m + n * m + n * m + n + m) = O(n * m)

- Space Complexity: O(1)

