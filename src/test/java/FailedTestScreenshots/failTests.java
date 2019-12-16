package FailedTestScreenshots;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(customListener.class)
public class failTests extends base {

	
	@BeforeMethod
	public void setUp() {
		initialize();
	}
	
	
	@Test
	public void loginPagetest()
	{
		assertEquals(false, true);
	}
	
	@Test
	public void homePagetest()
	{
		assertEquals(false, true);
	}
	@Test
	public void createDeals()
	{
		assertEquals(false, true);
	}
	@Test
	public void createContact()
	{
		assertEquals(false, true);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
