package SeleniumTraining.WebAppTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksFunctionality {

	@Test
	public void LinksFunctionality() throws InterruptedException {
		System.setProperty("WebDriver.chrome. driver", "E:/SW Installs/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println("Number of Links in the whole page:");
        System.out.println(driver.findElements(By.tagName("a")).size());
        System.out.println("Number of Links in the Footer section of the page:");
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        System.out.println("Number of Links in the first column Footer section of the page:");
        WebElement columndriver = footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());
        
        for(int i= 1; i<columndriver.findElements(By.tagName("a")).size();i++)
        	
        {
        	String clickonLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
        	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
        	Thread.sleep(5000);
        	
        }
	
        	//open all the tabs
        	
        	Set<String> abc = driver.getWindowHandles();
        	Iterator<String> it = abc.iterator();
        	while(it.hasNext())
            {
        	driver.switchTo().window(it.next());
        	System.out.println(driver.getTitle());
       
        	}
        	
        	driver.close();
        }


	}


