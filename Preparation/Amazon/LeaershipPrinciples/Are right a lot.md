Are right a lot


//Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

//An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
//You may assume all four edges of the grid are all surrounded by water.


//Example 1:

//Input: grid = [
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]
//Output: 1

//Example 2:

//Input: grid = [
//  ["1","1","0","0","0"],
//  ["1","1","0","0","0"],
//  ["0","0","1","0","0"],
//  ["0","0","0","1","1"]
//]
//Output: 3

//
//1 land
//0 water
0 0 0 0 .......... water
// 0 ["X","1","X"],0
// 0 ["1","0","1"] 0
// 0 ["X","1","X"],0
0 0 0 0 .......... water

x = 1 - n-1 X: Column
y = 1 - p-1 Y: Rows


Basic case 
//x,y (1 land)
0 0 0  
0 (x,y)  0
0 0 0

//[1, 0, 1]
[0, 1, 0]

import numpy

def count_island(grid): // N,M
    //find all 1s -> top number of island -> create a list
    lands_list = []
    for x in range(1,n-2)
        for y in range(1,n-2)
            if (grid[x][y]==1)
                lands_list.append(grid[x][y])
    //group by connection
    //find_connections

    current_island = []
    //take 1st element
    //pivot element
    g=0
    current_island[0]=lands_list[0][0] // position 1,1
    lands_list.remove(lands_list[0][0])
    while size(land_list) > 0
        for land in land_list
            for island_item in current_island 
                if (is_connected(land, island_item))
                   lands_list.remove(land)
                   current_island.append(land)
        g=g+1
        //reset island
        current_island = []
        current_island[0]=island_list[0] 
    return g
    
def is_connected(land, island_item):
    return ( island_item(x-1,y-1) == land ||
        island_item(x-1,y) == land ||
        island_item(x-1,y+1) == land ||
        island_item(x,y+1) == land ||
        island_item(x,y-1) == land ||
        island_item(x+1,y-1) == land ||
        island_item(x+1,y) == land ||
        island_item(x+1,y+1) == land )
    
    
BIG O Time=  (N*M) + (N*M)*(N*M)
N=M N 2 + N2 * N2 = N**4

Space : N*M + N*M + N*M
N**2
        
//Input: grid = [
    
    
//  ["1","1","0","0","0"],
//  ["1","1","0","0","0"],
//  ["0","0","1","0","0"],
//  ["0","0","0","1","1"]
//]
//Output: 3
    
    
land_list = [[0,0],[0,1],[1,0][1,1][2,2],[3,3],[4,3]]     // all the possitions that are land
land_list = [[3,3],[4,3]]   
island_list= [[0,0],[0,1],[1,0],[1,1] ; [[2,2]]]
    
    
