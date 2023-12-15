package SeleniumTraining.WebAppTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableDataFetching {

	@Test
	public void TableDataFetching() {
		System.setProperty("WebDriver.chrome. driver", "E:/SW Installs/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int sum = 0;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		WebElement table = driver.findElement(By.id("product"));
		
		System.out.println(driver.findElements(By.xpath("//table[@class='table-display']//tr")).size());
		
	//	System.out.println(driver.findElements(By.xpath("//table[@class='table-display']//th")).size());
		
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		
		List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(4).findElements(By.tagName("td"));
		
		System.out.println(secondrow.get(0).getText());


		System.out.println(secondrow.get(1).getText());


		System.out.println(secondrow.get(2).getText());
		driver.close();
		
	//	List<WebElement> secondrows=table.findElements(By.xpath("//table[@class='table-display']//tr[2]")).size());
		
		/*
		 * List<WebElement>values =
		 * driver.findElements(By.xpath("//table[@class='table-display']//tr//th"));
		 * for(int i=0; i<=values.size();i++) {
		 * 
		 * System.out.println(values);
		 * 
		 * 
		 * }
		 */
		
	}

}
