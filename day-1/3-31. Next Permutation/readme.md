
# 31. Next Permutation


## Question Link

[Next Permutation](https://leetcode.com/problems/next-permutation/)

## Help

- [take U forward](https://www.youtube.com/watch?v=LuLCLgMElus): Approach1


## Approach1

- Find first decreasing adjacent pair index, mark it as index1 from right side

- Find index2 such that arr[index2]>arr[index1] from right side

- Swap index1 and index2

- Sort the elements after index1

- Time Complexity:O (n + n + n) = O(n)

- Space Complexity: O(1)

## Copy Notes

![1](https://github.com/sidsri1999/striver-sde-sheet/blob/main/day-1/3-31.%20Next%20Permutation/images/1.jpg)
![2](https://github.com/sidsri1999/striver-sde-sheet/blob/main/day-1/3-31.%20Next%20Permutation/images/2.jpg)
![3](https://github.com/sidsri1999/striver-sde-sheet/blob/main/day-1/3-31.%20Next%20Permutation/images/3.jpg)
![4](https://github.com/sidsri1999/striver-sde-sheet/blob/main/day-1/3-31.%20Next%20Permutation/images/4.jpg)



