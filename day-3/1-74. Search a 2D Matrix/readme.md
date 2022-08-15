
# 74. Search a 2D Matrix


## Question Link

[Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)

## Help

- [Self](#): Approach1, Approach2, Approach3
- [take U forward](https://www.youtube.com/watch?list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&v=ZYpYur0znng): -


## Approach1

- Traverse all elements in the matrix one by one.

- Time Complexity: O(n*m)

- Space Complexity: O(1)

## Approach2

- Compare first and last element of each row, if target lies in that do the binary search for that row.

- Time Complexity: O(mlogn)

- Space Complexity: O(1)

## Approach3

- Start from top right element.

- And if target is less than current element, move to left of row.

- Else move to down in the column.

- Time Complexity: O(m+n)

- Space Complexity: O(1)


