
# 62. Unique Paths


## Question Link

[Unique Paths](https://leetcode.com/problems/unique-paths/)

## Help

- [Self](#): Approach1, Approach2
- [take U forward](https://www.youtube.com/watch?v=t_f0nwwdg5o): Approach3


## Approach1

- Recursive

- Each time make a recursive call one time by moving right and another time by moving down

- if we crosses the grid return 0

- if we reach at bottom right cell return 1

- Time Complexity: Exponential

- Space Complexity: Exponential

## Approach2

- Recursive And DP

- The time complexity of above approach will take exponential, so we are using the dp array to reduce recursive calls.

- Count the number of 0s, 1s and 2s

- Now, first put 0s then 1s then 2s

- Time Complexity: O(m*n)

- Space Complexity: O(m*n) + O(m*n) = O(m*n)

## Approach3

- Combinatorics

- The moves which we have to make to reach target cell is m-1 down moves and n-1 right moves.

- So, either we choose possible combinations either n-1 out of m+n-2 or m-1 out of m+n-1, i.e. nCr

- Time Complexity: O(m*n)

- Space Complexity: O(m*n)


