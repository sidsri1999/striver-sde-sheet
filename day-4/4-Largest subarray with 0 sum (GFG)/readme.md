
# Largest subarray with 0 sum (GFG)


## Question Link

[Largest subarray with 0 sum](https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1)

## Help

- [Self](#): Approach1
- [take U forward](https://www.youtube.com/watch?list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&v=xmguZ6GbatA): Approach2


## Approach1

- Traverse using two loops, and generate all subarrays and check if there is sum is 0 or not. (Kadane's Algorithm Of Generating Subarrays)

- Time Complexity:O (n^2)

- Space Complexity: O(1)

## Approach2

- Create a Map, storing prefixSum, and value the first time that prefix sum appears at which index.

- Now, traverse through each element if prefixSum = 0, then update the maxLength.

- If not, then check if prefixSum already appeared by using hashmap and if appeared check the length, if not appeared put it in hashmap.

- Time Complexity:O (n)

- Space Complexity: O(n)

