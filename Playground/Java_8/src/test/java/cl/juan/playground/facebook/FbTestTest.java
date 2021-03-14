package cl.juan.playground.facebook;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class FbTestTest {
    FbTest fbTest;





    @Before
    public void setUp() {
        fbTest = new FbTest();
    }

    @After
    public void tearDown() {
    }


    @Test
    public void test(){
        System.out.printf("hola");
        assertThat(fbTest, is(is(notNullValue())));
    }
}