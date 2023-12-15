package SeleniumTraining.WebAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Switchtoframe {

	@Test
	public void SwithctoFrame() throws InterruptedException {
		System.setProperty("WebDriver.chrome. driver", "E:/SW Installs/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("enter-name")).sendKeys("QA");
		//driver.findElement(By.id("alertbtn")).click();
		//Thread.sleep(5000);
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		String str = driver.switchTo().alert().getText();
		System.out.println(str);
		Assert.assertEquals("Hello , Are you sure you want to confirm?", str);
        driver.switchTo().alert().accept();
		driver.close();
	}

}
