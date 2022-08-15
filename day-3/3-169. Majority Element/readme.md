
# 169. Majority Element


## Question Link

[Majority Element](https://leetcode.com/problems/majority-element/)

## Help

- [Self](#): Approach1, Approach2
- [take U forward](https://www.youtube.com/watch?v=AoX3BPWNnoE&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2): Approach3


## Approach1

- Sort The Array

- n/2 th element will be the majority element

- Time Complexity: O(nlogn)

- Space Complexity: O(1)

## Approach2

- Count occurrence of each element and putting it in hashmap

- If count increases n/2 return that element.

- Time Complexity: O(n)

- Space Complexity: O(n)

## Approach3

- Make currentElement as nums[0], and count = 1

- Now, we will traverse each element, if count==0 we are going to point currentElement to nums[i]

- If currentELement == nums[i], we are just going to increase the count

- Else we are going to decrease the count

- The value in the currentELement will be our maximum repeated value

- Time Complexity: O(n)

- Space Complexity: O(1)


