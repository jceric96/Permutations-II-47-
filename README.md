## 47. Permutations II

Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

questiones:

1. Do thoes numbers contain negative numbers?
2. What's the length of the nums array? 

Constraints:

1 <= nums.length <= 8
-10 <= nums[i] <= 10

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]

                 []
            |         |
           [1]       [2]
         |     |      |
       [1,1] [1,2]  [2,1]
         |     |      |
    [1,1,2] [1,2,1] [2,1,1]

Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]


