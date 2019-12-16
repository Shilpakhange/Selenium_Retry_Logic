package FailedTestScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static WebDriver driver;
	
	public static void initialize() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shilpa Khandge\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	public void takeScreenshot(String fname) {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\Shilpa Khandge\\eclipse-workspace\\RetryLogic\\Screenshots\\"+fname+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
