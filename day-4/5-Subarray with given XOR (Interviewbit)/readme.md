
# 75. Subarray with given XOR (Interviewbit)


## Question Link

[Subarray with given XOR](https://www.interviewbit.com/problems/subarray-with-given-xor/)

## Help

- [Self](#): Approach1
- [take U forward](https://www.youtube.com/watch?v=lO9R5CaGRPY): Approach


## Approach1

- Using two loops get all subarrays and check their XOR, if equal to given target increase count

- Time Complexity:O (n^2)

- Space Complexity: O(1)

## Approach2

- For each element check prefix Xor.

- If that is equal to target, increase count.

- Now, calculate Y which is prefixXor^target

- If Y present in map, increase count by that many times it occurred

- Now, put the prefixXor value in map, if already there increase its value by 1.

- Time Complexity: O(n)

- Space Complexity: O(n)


