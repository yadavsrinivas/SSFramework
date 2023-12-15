package SeleniumTraining.WebAppTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome. driver", "E:/SW Installs/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/client/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("userEmail")).sendKeys("srinivas.siraboyna@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='enter your passsword']")).sendKeys("Anuradha@28");
		driver.findElement(By.cssSelector("input#login")).click();
	//	driver.findElement(By.linkText("Forgot password?")).click();
	//	driver.findElement(By.partialLinkText("Regi")).click();
	    driver.getTitle();
	    String title1 = driver.getTitle();
		System.out.println(title1);
		
		
		
		;

		
	}

}
