package com.cts.test.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.cts.test.samples.MyEvenOdd;

public class MyEvenOddTest {

	 @Test
	    public void testEvenOddNumber(){
	        MyEvenOdd meo = new MyEvenOdd();
	        assertEquals("10 is a even number", true, meo.isEvenNumber(10));
	        assertEquals("9 is a odd number", false, meo.isEvenNumber(9));
	    }
}
