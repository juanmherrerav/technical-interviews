# Unique paths in a Grid with Obstacles

Difficulty Level : Easy
Last Updated : 06 Apr, 2021

Given a grid of size m * n, let us assume you are starting at (1, 1) and your goal is to reach (m, n). At any instance, if you are on (x, y), you can either go to (x, y + 1) or (x + 1, y).
Now consider if some obstacles are added to the grids. How many unique paths would there be?
An obstacle and empty space are marked as 1 and 0 respectively in the grid.

Examples:

Input:
```md
[[0, 0, 0],
 [0, 1, 0],
 [0, 0, 0]]
```
Output : 2
There is only one obstacle in the middle.

Recommended: Please try your approach on {IDE} first, before moving on to the solution.
We have discussed a problem to count the number of unique paths in a Grid when no obstacle was present in the grid. But here the situation is quite different. While moving through the grid, we can get some obstacles which we can not jump and that way to reach the bottom right corner is blocked.
The most efficient solution to this problem can be achieved using dynamic programming. Like every dynamic problem concept, we will not recompute the subproblems. A temporary 2D matrix will be constructed and value will be stored using the bottom up approach.

Approach
Create a 2D matrix of same size of the given matrix to store the results.
Traverse through the created array row wise and start filling the values in it.
If an obstacle is found, set the value to 0.
For the first row and column, set the value to 1 if obstacle is not found.
Set the sum of the right and the upper values if obstacle is not present at that corresponding position in the given matrix
Return the last value of the created 2d matrix
