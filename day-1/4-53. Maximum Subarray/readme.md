
# 53. Maximum Subarray


## Question Link

[Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)

## Help

- [Self](#): Approach1
- [Leetcode Discuss](https://leetcode.com/problems/maximum-subarray/discuss/): Approach 2
- [take U forward](https://www.youtube.com/watch?v=w_KEocd__20&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=6): Approach3


## Approach1

- Brute Force

- Start from each index, and find max sum starting from that index till the end

- if that sum is greater than total sum, put it in total sum

- Return the answer

- Time Complexity:O (n ^ 2)

- Space Complexity: O(1)

## Approach2

- Assign currentSum and maxSumTillNow now to fist value.

- Now, for each upcoming index, check whether (currentSum+nums[currentIndex]) or nums[currentIndex] is alone greater, put max in current sum. 

- If current sum is greater than maxSumTillNow, update maxSumTillNow with currentSum

- Time Complexity:O (n)

- Space Complexity: O(1)

## Approach3

- Kadane's Algorithm

- Take sum as 0, and max as nums[0]

- Now, traverse each index and add it sum, if sum>max, update max with sum.

- If sum less than 0, we are making it sum to 0, because there is no use to add -ve value to any number, it will give less only.

- Time Complexity: O(n)

- Space Complexity: O(1)


