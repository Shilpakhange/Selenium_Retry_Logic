package Mytests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestRetry {

	//test-level retry logic---
	
	@Test(retryAnalyzer=Analyzer.retryAnalyzer.class)
	public void test1()
	{
		assertEquals(false, true);
	}

	
	@Test(retryAnalyzer=Analyzer.retryAnalyzer.class)
	public void test2()
	{
		assertEquals(true, false);
	}
}
