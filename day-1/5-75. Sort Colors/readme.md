
# 75. Sort Colors


## Question Link

[Sort Colors](https://leetcode.com/problems/sort-colors/)

## Help

- [Self](#): Approach1, Approach2
- [take U forward](https://www.youtube.com/watch?v=oaVa-9wmpns&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=3): Approach3


## Approach1

- Sort The Array

- Time Complexity:O (n log n)

- Space Complexity: O(1)

## Approach2

- Using Counting sort

- Count the number of 0s, 1s and 2s

- Now, first put 0s then 1s then 2s

- Time Complexity:O (n + n) = O(n)

- Space Complexity: O(1)

## Approach3

- Dutch National Flag Algorithm

- Take 3 pointer low, mid pointing to 0th index and high pointing to last index

- Our intuition is before low all elements are 0, after high all elements are 2.

- Start from 0th index, if 0 swap low and mid and move low and mid by 1, if 1 move mid by 1, if 2 swap mid with high and decrease high by 1

- move till low<=high 

- Time Complexity: O(n)

- Space Complexity: O(1)


