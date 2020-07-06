package cl.juan.playground.amazon.demo;


import org.junit.Test;

public class GeneralizedGCDTest {


    @Test
    public void testSample()
    {
        int arr[] = { 2, 4, 6, 8, 16 };
        int n = arr.length;
        System.out.println(GeneralizedGCD.findGCD(arr, n));
    }

}