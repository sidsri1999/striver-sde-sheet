
# 3. Longest Substring Without Repeating Characters


## Question Link

[Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

## Help

- [Self](#): Approach1
- [take U forward](https://www.youtube.com/watch?v=qtVh-XEpsJo): Approach2, Approach3


## Approach1

- Traverse using two loops

- Inside first loop create a set and put each character one by one in the set if set already containing the charachter break and compare it with maxLength.

- Time Complexity: O(n)

- Space Complexity: O(n)

## Approach2

- Sliding window approach

- Make two pointers start and end, and each time when we are going to increment end till we not get the same character and adding it to set.

- If we find the character again, we increment start till we remove that repeated char from starting.

- Time Complexity:O (n + n) = O(n)

- Space Complexity: O(n)

## Approach3

- Sliding window with Hashmap

- Make two pointers start and end, and each time when we are going to increment end till we not get the same character and adding it to set.

- Whenever we get repeated charachter, we increment the start by checking the index from hashmap.

- Start from 0th index, if 0 swap low and mid and move low and mid by 1, if 1 move mid by 1, if 2 swap mid with high and decrease high by 1

- Time Complexity: O(n)

- Space Complexity: O(n)


