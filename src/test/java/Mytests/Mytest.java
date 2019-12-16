package Mytests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Mytest {

	@Test
	public void test1()
	{
		assertEquals(false, true);
	}

	
	@Test
	public void test2()
	{
		assertEquals(true, false);
	}

}
