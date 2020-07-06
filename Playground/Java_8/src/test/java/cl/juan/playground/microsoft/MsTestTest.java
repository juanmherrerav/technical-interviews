package cl.juan.playground.microsoft;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class MsTestTest {


    @Before
    public void setUp(){

    }

    @Test
    public void testNUll(){
        MsTest test = new MsTest();
        int result= test.findFirstBrokenBuild(null);
        assertEquals(-1,result);
    }

    @Test
    public void testEmpty(){
        MsTest test = new MsTest();
        int result= test.findFirstBrokenBuild(new ArrayList<>());
        assertEquals(-1,result);
    }

    @Test
    public void testBeginning(){
        MsTest test = new MsTest();
        int result= test.findFirstBrokenBuild( new ArrayList<>(Arrays.asList("f","t","t")));
        assertEquals(1, result);
    }

    @Test
    public void testBeginn(){
        MsTest test = new MsTest();
        int result= test.findFirstBrokenBuild( new ArrayList<>(Arrays.asList("t","t","t")));
        assertEquals(0,result);
    }

    @Test
    public void testMiddle(){
        MsTest test = new MsTest();
        int result= test.findFirstBrokenBuild( new ArrayList<>(Arrays.asList("f","f","f","f","f","t","t","t","t","t","t")));
        assertEquals(5,result);
    }

    @Test
    public void testEnd(){
        MsTest test = new MsTest();
        int result= test.findFirstBrokenBuild( new ArrayList<>(Arrays.asList("f","f","f","f","f","f","f","f","t")));
        assertEquals(8,result);
    }

    @Test
    public void testNone(){
        MsTest test = new MsTest();
        int result= test.findFirstBrokenBuild( new ArrayList<>(Arrays.asList("f","f","f","f","f","f","f","f")));
        assertEquals(-1,result);
    }

}