# Ship Together

> Amazon warehouse has a group of n items of various weights lined up in a row. A segment of contiguously placed items can be shipped together if and only if the difference between the weights of the heaviest and lightest item differs by at most k to avoid load imbalance.
>Given the weights of the items and an integer k ,find the number of segments of items that can be shipped together.
> Note: A segment(1,r) is a subarray starting at index/and ending at index r where 1≤r.

Example

```bash
k=3
weights=[1,3,6]

Weight difference between max and min for each (1,r) index pair are:

  -(0,0) -> max(weights[0])-min(weights[0]) =max(1)-min(1)=1-1=0  
  -(0,1) -> max(1,3)-min(1,3)     = 3-1 = 2  
  -(0,2) -> max(1,3,6)-min(1,3,6) = 6-1 = 5 ***difference > k***  
  -(1,1) as max(3)-min(3)         = 3-3 = 0  
  -(1,2) as max(3,6)-min(3,6)     = 6-3 = 3  
  -(2,2) as max(6)-min(6)         = 6-6 = 0  

5 of the 6 possible segments have a difference less than or equal to 3. Return 5.
```

## Function Description

Complete the function countPossibleSegments in the editor below.
countPossibleSegments has the following parameters:
  
- int k: the maximum tolerable difference in weights
- int weights[n] : the weights of the items

Returns

  long int:the number of segments of items that can be shipped together

Constraints

- 1 ≤ k ,weights[i]≤10⁹
- 1 ≤ n ≤ 3*105

## Input Format For Custom Testing

- The first line contains an integer **k**.
- The second line contains an integer **n** ,the number size of weights.
 Each line i ( 0 ≤ i < n ) of the n subsequent lines contains an integer, weights[i].

### Sample Case 0

Sample Input For Custom Testing

  STDIN FUNCTION

```bash
  3
  3
  1
  5
  4
```

- k = 3
- weights[] size n = 3
- weights[1,5,4]

 Sample Output

```bash
  4
```

### Explanation

The balanced subsegments only are:

- (0,0) as max(weights[0])-min(weights[0])=1-1=0.
- (1,2) as max(weights[1],weights[2])-min(weights[1],weights[2])=5-4=1.
- (2,2) as max(weights[2])-min(weights[2])=4-4=0.
- (1,1) as max(weights[1])-min(weights[1])=5-5=0.
