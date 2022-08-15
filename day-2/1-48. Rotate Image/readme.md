
# 48. Rotate Image


## Question Link

[Rotate Image](https://leetcode.com/problems/rotate-image/)

## Help

- [Self](#): Approach1
- [take U forward](https://www.youtube.com/watch?v=Y72QeX0Efxw&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=13): Approach2



## Approach1

- Create an extra matrix of same size.

- For each row from top, put it last column in matrix, move row down and column left.

- Traverse new matrix and put that data in old matrix.

- Time Complexity: O( n * n )

- Space Complexity: O( n * n )


## Approach 2

- Do the transpose of matrix

- Now, reverse each row

- Time Complexity: O( (n * n) + (n * n)) = O(n * n) 

- Space Complexity: O( 1 )


