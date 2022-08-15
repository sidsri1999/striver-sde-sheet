
# 121. Best Time to Buy and Sell Stock


## Question Link

[Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

## Help

- [Self](#): Approach1, Approach2
- [take U forward](https://www.youtube.com/watch?v=oaVa-9wmpns&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=3): Approach3


## Approach1

- Traverse using two loops, buying at ith day and selling at jth day and check we are getting max profit.

- Time Complexity:O (n^2)

- Space Complexity: O(1)

## Approach2

- For each day we have traversed calculate the least price.

- And sell the stock at current day to get max profit

- Time Complexity: O(n)

- Space Complexity: O(1)


