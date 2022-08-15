
# 493. Reverse Pairs


## Question Link

[Reverse Pairs](https://leetcode.com/problems/reverse-pairs/)

## Help

- [Self](#): Approach1
- [take U forward](https://www.youtube.com/watch?v=S6rsAlj_iB4): Approach2


## Approach1

- Traverse using two loops and check the condition whethe it satisfies or not.

- Time Complexity:O (n^2)

- Space Complexity: O(1)

## Approach2

- Using merge sort

- Here, when we merge two arrays, before that we will check two arrays elements satisfies the condition or not.

- Time Complexity: O(nlogn){mergeSort} + O(n){merge} + O(n){counting} = O(nlogn)

- Space Complexity: O(n)


