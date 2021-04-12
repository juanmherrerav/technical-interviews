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





}
