package SeleniumTraining.WebAppTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome. driver", "E:/SW Installs/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		driver.manage().window().maximize();
		Select staticdd = new Select(staticdropdown);
		// staticdd.selectByIndex(2);
		// staticdd.selectByVisibleText("USD");
//		staticdd.selectByValue("AED");

		driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li.ui-menu-item a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("INDIA"))

			{
				option.click();
				break;

			}

		}

		Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());

		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();

		// System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());

		Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets", title);

		
	     driver.findElement(By.
		  xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT'][@value='Departure City']")).click();
		 driver.findElement(By.xpath("//a[@text='Ahmedabad (AMD)']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//li//a[@text='Hyderabad (HYD)'])[2]")).click();
		 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		 
		 //To verify Roundtrip date picker is enabled or disabled
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	
		 driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			{
				System.out.println("is enable");
				Assert.assertTrue(true);
			}

			
			 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();		
			//driver.findElement(By.className("ui-state-default ui-state-hover")).click();
			
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(3000);
			
			for(int i=0; i<5; i++)
			{
				 driver.findElement(By.id("hrefIncAdt")).click();
			}
			
			driver.findElement(By.id("btnclosepaxoption")).click();
			
			driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	}

}
