package cl.juan.playground.codility;


import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;



public class BynaryGapTest {
    BynaryGap bynaryGap;
    @Before
    public void setUp() {
        bynaryGap = new BynaryGap();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGiven_method_When_InputIs529_Then_resultIs4() {
        assertThat("Binary Gap for 529 should be 4",bynaryGap.solution(529), CoreMatchers.is(4));
    }


    @Test
    public void testGiven_DecimalInput_When_InputIs4_Then_DecimalIs100() {
        Assert.assertArrayEquals( new int[] { 1, 0,0 }, bynaryGap.decimalToBinary(4) );
    }

    @Test
    public void testGiven_DecimalInput_When_InputIs529_Then_BinarySizeIs() {
        System.out.println(Arrays.toString(bynaryGap.decimalToBinary(539)));
        Assert.assertEquals( 4, bynaryGap.traverseAndRecordGaps(new int[] { 1, 0, 0, 0, 0, 1, 1, 0, 1, 1 }) );
    }

    @Test
    public void testGiven_DecimalInput_When_InputIsDecimal_Then_isConvertedToBynary() {
        assertThat("4 in Decimal Notation, uses 3 digits in bynary Notation",bynaryGap.binaryDigitsSize(4), CoreMatchers.is(3));
    }

    @Test
    public void testGiven_BynaryArray_When_hasGap_Then_returnsGapSize() {
        assertThat("gap size",bynaryGap.solution(9), CoreMatchers.is(2));
    }
    @Test
    public void testGiven_BynaryArray_When_hasGap_Then_returnsGapSize2() {
        assertThat("gap size",bynaryGap.solution(529), CoreMatchers.is(4));
    }

    @Test
    public void testGiven_DecimalInput_When_InputIs529_Then_BinarySizeIs2() {
        System.out.println(Arrays.toString(bynaryGap.decimalToBinary(32)));
        Assert.assertEquals( 0, bynaryGap.traverseAndRecordGaps(new int[] { 1, 0, 0, 0, 0, 0 }) );
    }

    @Test
    public void testGiven_BynaryArray_When_hasGap_Then_returnsGapSize3() {
        assertThat("gap size",bynaryGap.solution(32), CoreMatchers.is(0));
    }
}