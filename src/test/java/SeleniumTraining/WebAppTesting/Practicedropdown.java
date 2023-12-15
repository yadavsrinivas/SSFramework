package SeleniumTraining.WebAppTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicedropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome. driver", "E:/SW Installs/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int sum = 0;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.id("autocomplete")).sendKeys("UNIT");
		Thread.sleep(3000L);
		
		List<WebElement>options = driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("UNITED KINGDOM (UK)"))
					
					{
				       option.click();
				       break;
					}
			
			
		}
		System.out.println(driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).getAttribute("value"));
	}

}
