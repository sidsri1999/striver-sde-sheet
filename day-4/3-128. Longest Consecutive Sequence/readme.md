
# 128. Longest Consecutive Sequence


## Question Link

[Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/)

## Help

- [Self](#): Approach1
- [take U forward](https://www.youtube.com/watch?v=qgizvmgeyUM): Approach2


## Approach1

- Sort The Array

- Check if nums[i-1]+1 = nums[i]

- Time Complexity:O (n log n)

- Space Complexity: O(1)

## Approach2

- Create a set, and store all elements to it

- Traverse through each element from array and check

- Whether we have number lower than this in the set, if yes then that element will not be the starting point of the sequence

- If no check the size of sequence from that starting point

- Time Complexity: O(n)

- Space Complexity: O(n)





