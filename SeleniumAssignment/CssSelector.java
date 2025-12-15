package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://www.saucedemo.com");

      
        WebElement username = driver.findElement(By.cssSelector("#user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.cssSelector(".submit-button"));
        loginBtn.click();

       // driver.quit();


	}

}
