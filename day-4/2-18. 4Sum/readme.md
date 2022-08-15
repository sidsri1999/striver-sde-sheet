
# 18. 4Sum


## Question Link

[4Sum](https://leetcode.com/problems/4sum/)

## Help

- [Self](#): Approach1
- [take U forward](https://www.youtube.com/watch?v=4ggF3tXIAp0): Approach2, Approach3


## Approach1

- Traverse through 4 loops

- If sum of those four equal to target, sort those values and put it in set

- Time Complexity:O (n^4)

- Space Complexity: O(n^4)

## Approach2

- Traverse through 3 loops, and for fourth one do binary search

- Time Complexity:O (n^3logn)

- Space Complexity: O(n^3)

## Approach3

- Traverse through 2 loops

- For next two elements do two sum approach, by using two pointers

- Time Complexity:O (n^3logn)

- Space Complexity: O(n^3)


