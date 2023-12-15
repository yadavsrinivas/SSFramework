package SeleniumTraining.WebAppTesting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SSLCheck {
 @Test
	public void SSLChecking() {
		ChromeOptions options = new ChromeOptions(); 
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		options.setAcceptInsecureCerts(true);
		System.setProperty("WebDriver.chrome. driver", "E:/SW Installs/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		//Block all the popup windows
		options.setExperimentalOption("excludeSwitches",
		Arrays.asList("disable-popup-blocking"));
		
		//Set download directory
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		
	   //delete cookies
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sss");
		//click on any link it will be redirected to login page for login page once delete the cookies were done.
		driver.close();
	}

}
