package cl.juan.playground.amazon.path.count;

public class UniquePathWithObstacles {



        static int uniquePathsWithObstaclesTabulated(int[][] A)
        {

            int rows = A.length;
            int columns = A[0].length;

            // create a 2D-matrix and initializing
            // with value 0
            int[][] paths = new int[rows][columns];
            for(int i = 0; i < rows; i++)
            {
                for(int j = 0; j < columns; j++)
                {
                    paths[i][j] = 0;
                }
            }

            // Initializing the bottom right corner if no obstacle there
            if (A[rows-1][columns-1] == 0)
                paths[rows-1][columns-1] = 1;

            // Initializing last row of the 2D matrix
            for(int c = columns-2; c >= 0; c--) {
                if (A[rows-1][c+1] == 0)
                    paths[rows-1][c] = paths[rows-1][c+1];
                else
                    paths[rows-1][c] = 0;
            }
            // Initializing last column of the 2D matrix
            for(int r = rows-2; r >= 0; r--) {
                // If not obstacle
                if (A[r+1][columns-1] == 0)
                    paths[r][columns-1] = paths[r+1][columns-1];
                else
                    paths[r][columns-1] = 0;
            }

            for(int r = rows-2; r >= 0; r--) {
                for(int c = columns-2; c >= 0; c--) {
                    // If current cell is not obstacle
                    if (A[r][c] == 0)
                        paths[r][c] = paths[r + 1][c] + paths[r][c + 1];

                }
            }
            for (int i = 0; i < paths.length; i++) { //this equals to the row in our matrix.
                for (int j = 0; j < paths[i].length; j++) { //this equals to the column in each row.
                    System.out.print(paths[i][j] + " ");
                }
                System.out.println(); //change line on console as row comes to end in the matrix.
            }
            return paths[0][0];
        }







/*“In an amazon fulfillment center. A robot is located at the top-left corner of a m x n grid.
        The robot can only move either down or right at any point in time. The robot is trying to
        reach the bottom-right corner of the grid to pick up the target item.
        How many possible unique paths are there?”
*/
/*class FullfillmentRobot{
    static int uniquePaths(int rows, int columns){
        //

        //initialize matrix
        int[][] matrix = new int[rows][columns]
        //initialize first row
        for (int i = 0 ; i < columns; i++){
            matrix[0][i] = 1;
        }
        //initialize first column
        for (int i = 1 ; i < rows; i++){
            matrix[i][0] = 1;
        }

        //calculate other paths
                /*
        [
        1 1 1 1
        1 2 3 4
        1 3 6 10
        1 4 10 20

        ]

        **/
/*
        for (int i = 1 ; i < columns; i++){
            for (int j = 1 ; j < rows; j++){
                matrix[i][j] = matrix[i][j-1] + matrix[i-1][j];
            }
        }

        return matrix[rows-1][columns-1];
    }
}*/





/*“What if there are some obstacles that the robot cannot pass? (robot’s start point and target item position don’t change)”
        * 1 represents the starting cell. There is exactly one starting cell.
        * 2 represents the ending cell. There is exactly one ending cell.
        * 0 represents the cell the robot can pass through.
        * -1 represents obstacles that robot cannot walk over.
*/
/*class FullfillmentRobot{
    static int uniquePaths(int rows, int columns ,int[][] map){


        //initialize matrix
        int[][] matrix = new int[rows][columns]

        //initialize first row
        boolean bloq = false;
        for (int i = 0 ; i < columns; i++){
            if (bloqu || map[0][i]) == -1  ) {
                matrix[0][i] = 0;
                bloq = true
            }else {
                matrix[0][i] = 1;
            }
        }
        //initialize first column
        bloq = false;
        for (int i = 1 ; i < rows; i++){
            if (bloqu || map[i][0]) == -1  ) {
                matrix[i][0] = 0;
                bloq = true;
            }else {
                matrix[i][0] = 1;
            }
        }


        //calculate other paths
                /*

        [
        1 -1 0 0
        0 0  0 0
        0 0 -1 0
        0 0  0 2
        ]
        [
        1  0  0  0
        1  1  1  1
        1  2  0  1
        1  3  3  4
        ]
        **/

/*        for (int i = 1 ; i < columns; i++){
            for (int j = 1 ; j < rows; j++){
                if (map[i][0] == -1){
                    matrix[i][j] = 0;
                }else{
                    matrix[i][j] = matrix[i][j-1] + matrix[i-1][j];
                }
            }
        }

        return matrix[rows-1][columns-1];
    }*/
}
