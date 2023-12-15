package SeleniumTraining.WebAppTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCalender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome. driver", "E:/SW Installs/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		driver.findElement(By.id("form-field-travel_comp_date")).click();

		while (!driver.findElement(By.cssSelector("[class='flatpickr-month'] [class='cur-month']")).getText()
				.contains("March")) {
			
			driver.findElement(By.cssSelector("[class='flatpickr-month'] [class='flatpickr-next-month']")).click();
		}
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		// grab the common attribute and put it into the list
		int count = driver.findElements(By.className("flatpickr-day")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if (text.equalsIgnoreCase("18")) {
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}

	}

}
