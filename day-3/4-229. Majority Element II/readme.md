
# 229. Majority Element II


## Question Link

[Majority Element II](https://leetcode.com/problems/majority-element-ii/)

## Help

- [Self](#): Approach1
- [take U forward](https://www.youtube.com/watch?v=yDbkQd9t2ig): Approach2


## Approach1

- Create a map and store the occurrence of each element.

- Now, traverse the map, and check those element whose occurrence is greater than n/3

- Time Complexity: O(n)

- Space Complexity: O(n)

## Approach2

- Extended Boyer Moore’s Voting Algorithm

- Create two variables first element and secondElement with their count

- Now traverse the array

- if nums[i]==firstElement, increase firstCount

- else if nums[i]==secondElement, increase secondCount

- else if firstCount=0, firstElement = nums[i]

- else if secondCount=0, secondElement = nums[i]

- else decrease both count

- Now, again loop through the nums array and check whether count of first element and second element are greater than n/3

- Time Complexity:O (n)

- Space Complexity: O(1)



