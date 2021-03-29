# Check if a given sequence of moves for a robot is circular or not

## Problem

Difficulty Level : Medium
Last Updated : 06 Nov, 2020
Given a sequence of moves for a robot, check if the sequence is circular or not. A sequence of moves is circular if first and last positions of robot are same. A move can be on of the following.

* G - Go one unit
* L - Turn left
* R - Turn right

Examples:

Input: path[] = "GLGLGLG"
Output: Given sequence of moves is circular

Input: path[] = "GLLG"
Output: Given sequence of moves is circular

## Solution

The idea is to consider the starting position as (0, 0) and direction as East (We can pick any values for these). If after the given sequence of moves, we come back to (0, 0), then given sequence is circular, otherwise not.

```md
           N
           |
           |
   W -------------- E
           |
           |
           S 
```

The move ‘G’ changes either x or y according to following rules.
a) If current direction is North, then ‘G’ increments y and doesn’t change x.
b) If current direction is East, then ‘G’ increments x and doesn’t change y.
c) If current direction is South, then ‘G’ decrements y and doesn’t change x.
d) If current direction is West, then ‘G’ decrements x and doesn’t change y.

The moves ‘L’ and ‘R’, do not change x and y coordinates, they only change direction according to following rule.
a) If current direction is North, then ‘L’ changes direction to West and ‘R’ changes to East
b) If current direction is East, then ‘L’ changes direction to North and ‘R’ changes to South
c) If current direction is South, then ‘L’ changes direction to East and ‘R’ changes to West
d) If current direction is West, then ‘L’ changes direction to South and ‘R’ changes to North.
