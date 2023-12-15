package SeleniumTraining.WebAppTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class HomePage2 {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/client/");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
