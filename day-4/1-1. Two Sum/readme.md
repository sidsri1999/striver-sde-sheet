
# 1. Two Sum


## Question Link

[Two Sum](https://leetcode.com/problems/two-sum/)

## Help

- [Self](#): Approach1
- [take U forward](https://www.youtube.com/watch?v=dRUpbt8vHpo): Approach2, Approach3


## Approach1

- Find all the pairs and check whether there sum is equal to target.

- Time Complexity:O (n^2)

- Space Complexity: O(1)

## Approach2

- Create a new array of same length

- Sort the new array

- Make two pointers at start and end to new array, move till we get the sum of start and end value as target

- Now, search those values in original array and return their indices.

- Time Complexity: O(nlogn) + O(n) + O(n) = O(nlogn)

- Space Complexity: O(n)

## Approach3

- Use HashMap

- Traverve each element and check whether target-element value is already present in the hashmap, then return their indices, else put that element in hashmap

- Time Complexity: O(n)

- Space Complexity: O(n)


