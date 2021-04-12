package cl.juan.playground.amazon.path.count;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniquePathWithObstaclesTest {
    int[][] A = {
            { 0, 0, 0 , 0 },
            { 0, 1, 0 , 0 },
            { 0, 0, 0 , 0 },
            { 0, 0, 0 , 0 }, };

    int[][] B = {
            { 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 1, 0, 0, 0, 1, 0},
            { 0, 0, 0, 0, 1, 0, 0, 0},
            { 1, 0, 1, 0, 0, 1, 0, 0},
            { 0, 0, 1, 0, 0, 0, 0, 0},
            { 0, 0, 0, 1, 1, 0, 1, 0},
            { 0, 1, 0, 0, 0, 1, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0},
         };



    @Test
    @DisplayName("Path Validation")
    void shouldBeEqualTabulation() {
        assertEquals(  8, UniquePathWithObstacles.uniquePathsWithObstaclesTabulated(A));
        assertEquals( 27, UniquePathWithObstacles.uniquePathsWithObstaclesTabulated(B));
    }
}