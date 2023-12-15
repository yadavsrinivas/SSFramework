package SeleniumTraining.WebAppTesting;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicdDropDownTest {
	
	@Test
	public void DynamicDrpdown() throws InterruptedException {

	
		System.setProperty("WebDriver.chrome. driver", "E:/SW Installs/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT'][@value='Departure City']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@text='Ahmedabad (AMD)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li//a[@text='Hyderabad (HYD)'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		//System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
				//driver.findElement(By.xpath("//div[@id='travelOptions']//input[@value='RoundTrip']")).click();
				//System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.xpath("//div[@id='travelOptions']//input[@value='RoundTrip']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
      {
	  System.out.println("its enabled");
	       Assert.assertTrue(true);
	  
      }
		else 
		{
			 	
		       Assert.assertTrue(false);
		}
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		 Thread.sleep(2000L);

		 for(int i=1;i<5;i++)

		 {

		 driver.findElement(By.id("hrefIncAdt")).click();
		 

		 }
		 
		 driver.findElement(By.id("btnclosepaxoption")).click();
			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			
		//	driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		//	driver.findElement(By.xpath("input[id='ctl00_mainContent_btn_FindFlights']")).click();
			
			driver.close();
	}

}
