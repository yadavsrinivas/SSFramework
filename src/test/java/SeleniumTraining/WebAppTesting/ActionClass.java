package SeleniumTraining.WebAppTesting;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome. driver", "E:/SW Installs/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Actions a = new Actions(driver);
	
		a.moveToElement(driver.findElement(By.cssSelector("input.search-keyword"))).doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("input.search-keyword"))).contextClick().build().perform();

	}
	
	}
