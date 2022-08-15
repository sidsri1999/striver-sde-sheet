
# 50. Pow(x, n)


## Question Link

[Pow(x, n)](https://leetcode.com/problems/powx-n/)

## Help

- [Self](#): Approach1
- [take U forward](https://www.youtube.com/watch?v=l0YC3876qxg): Approach2


## Approach1

- Brute Force, Mutilply x to ans variable n times.

- Time Complexity:O (n)

- Space Complexity: O(1)

## Approach2

- Recursive Approach

- For pow(x,n)

- if n%2==0, call pow(x*x,n/2)

- else x*pow(x*x,n/2)

- Time Complexity: O(logn)

- Space Complexity: O(n)



