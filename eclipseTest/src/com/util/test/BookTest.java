package com.util.test;

import junit.framework.TestCase;

import org.junit.Test;

public class BookTest {

	@Test
	public void testDiv() {
		
		try{
			TestCase.assertEquals(Book.div(2, 2), 1);
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			
		}
	}

}
