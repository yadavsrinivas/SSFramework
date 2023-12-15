package SeleniumTraining.WebAppTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollingTable {

	@Test
	public void scrollingtable() {
		System.setProperty("WebDriver.chrome. driver", "E:/SW Installs/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  int sum = 0;
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  driver.manage().window().maximize();
		  
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollBy(0,500)");
		  
		  jse.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		  List<WebElement>values =
		  driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")); for(int
		  i=0; i<values.size(); i++) {
		  
		  sum = sum +Integer.parseInt(values.get(i).getText());
		 
		  } int total =
		 Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText()
		 .split(":")[1].trim());
		 
		 Assert.assertEquals(sum, total);
		 driver.close();
		
		}

	}


