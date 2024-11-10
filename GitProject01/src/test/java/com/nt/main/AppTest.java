package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

   
    @Test
    public void testSumWithPositives()
    {
    	App app=new App();
    	int expected=50;
    	int actual=app.sum(30, 20);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testSumWithNegatives()
    {
    	App app=new App();
    	int expected=-50;
    	int actual=app.sum(-30, -20);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testSumWithNegativeZeros()
    {
    	App app=new App();
    	int expected=0;
    	int actual=app.sum(-30, 30);
        assertEquals(expected,actual);
    }
}
