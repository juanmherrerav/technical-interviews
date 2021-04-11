package cl.juan.playground.amazon.path.reduction;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ReduceNto1Test {


    @Test
    @DisplayName("Given Preconditions When StateUnderTest Then ExpectedBehavior")
    void shouldBeEqual() {
        assertEquals( 2, ReduceNto1.getMinStepsto1(6));
        assertEquals( 7, ReduceNto1.getMinStepsto1(100));
        //assertEquals( 9, ReduceNto1.getMinStepsto1(1000));
        //assertEquals( 13, ReduceNto1.getMinStepsto1(5000));

    }

    @Test
    @DisplayName("Given Preconditions When StateUnderTest Then ExpectedBehavior")
    void shouldBeEqualMemo() {
        assertEquals( 2, ReduceNto1.getMinStepsto1Memo(6, new int[7]));
        assertEquals( 7, ReduceNto1.getMinStepsto1Memo(100, new int[101]));
        assertEquals( 9, ReduceNto1.getMinStepsto1Memo(1000, new int[1001]));
        assertEquals( 13, ReduceNto1.getMinStepsto1Memo(5000, new int[50001]));
    }

    @Test
    @DisplayName("Given Preconditions When StateUnderTest Then ExpectedBehavior")
    void shouldBeEqualTabulation() {
        assertEquals( 2, ReduceNto1.getMinStepsto1Tabulation(6));
        assertEquals( 7, ReduceNto1.getMinStepsto1Tabulation(100));
        assertEquals( 9, ReduceNto1.getMinStepsto1Tabulation(1000));
        assertEquals( 13, ReduceNto1.getMinStepsto1Tabulation(5000));
        assertEquals( 14, ReduceNto1.getMinStepsto1Tabulation(10000));
        assertEquals( 18, ReduceNto1.getMinStepsto1Tabulation(100000));
        assertEquals( 19, ReduceNto1.getMinStepsto1Tabulation(1000000));
        assertEquals( 22, ReduceNto1.getMinStepsto1Tabulation(10000000));
        assertEquals( 27, ReduceNto1.getMinStepsto1Tabulation(100000000));
        assertEquals( 28, ReduceNto1.getMinStepsto1Tabulation(200000000));
        //assertEquals( 31, ReduceNto1.getMinStepsto1Tabulation(715827880));
    }

    @Test
    @DisplayName("Given Preconditions When StateUnderTest Then ExpectedBehavior")
    void shouldBeEqualTabulationArrayList() {
        assertEquals(  2, ReduceNto1.getMinStepsto1TabulationArrayList(6));
        assertEquals(  7, ReduceNto1.getMinStepsto1TabulationArrayList(100));
        assertEquals(  9, ReduceNto1.getMinStepsto1TabulationArrayList(1000));
        assertEquals( 13, ReduceNto1.getMinStepsto1TabulationArrayList(5000));
        assertEquals( 14, ReduceNto1.getMinStepsto1TabulationArrayList(10000));
        assertEquals( 18, ReduceNto1.getMinStepsto1TabulationArrayList(100000));
        assertEquals( 19, ReduceNto1.getMinStepsto1TabulationArrayList(1000000));
        assertEquals( 22, ReduceNto1.getMinStepsto1TabulationArrayList(10000000));
        assertEquals( 27, ReduceNto1.getMinStepsto1TabulationArrayList(100000000));
        assertEquals( 28, ReduceNto1.getMinStepsto1TabulationArrayList(200000000));
        //assertEquals( 31, ReduceNto1.getMinStepsto1TabulationArrayList(715827880));
    }


}