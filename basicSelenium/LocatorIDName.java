package basicSelenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorIDName {

	public static void main(String[] args) {
		
		//to disable password breach pop-up
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_leak_detection", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//To enter user name
		WebElement usrname = driver.findElement(By.id("user-name"));
		usrname.sendKeys("standard_user");
		
		//to enter password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//to click submit button
		driver.findElement(By.id("login-button")).click();
		
		//to get text
		String actualResult = driver.findElement(By.className("title")).getText();
		
		if(actualResult.equals("Products")) {
			System.out.println("Login successful");
		}else {
			System.out.println("Login failed");
		}
	}

}
