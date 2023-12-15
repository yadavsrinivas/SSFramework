package SeleniumTraining.WebAppTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotFeature {
	
	@Test

	public void Screenshot() throws IOException {
		System.setProperty("WebDriver.chrome. driver", "E:/SW Installs/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int sum = 0;
		driver.get("https:google.com");
		driver.manage().window().maximize();
	   File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src, new File("E://screenshot.png"));
	   driver.close();
	   
	   
	    
	}

}
